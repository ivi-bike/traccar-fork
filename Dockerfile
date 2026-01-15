# Multi-stage build for Traccar with frontend

# Stage 1: Build Java backend
FROM eclipse-temurin:21-jdk AS backend-builder
WORKDIR /build
COPY . .
RUN ./gradlew build --no-daemon -x checkstyleMain -x checkstyleTest

# Stage 2: Build frontend
FROM node:22-alpine AS frontend-builder
WORKDIR /build
COPY traccar-web/package*.json ./
RUN npm ci --legacy-peer-deps
COPY traccar-web/ ./
RUN npm run build

# Stage 3: Create JRE
FROM eclipse-temurin:21 AS jdk
RUN jlink --module-path $JAVA_HOME/jmods \
    --add-modules java.se,jdk.charsets,jdk.crypto.ec,jdk.unsupported \
    --strip-debug --no-header-files --no-man-pages --compress=2 --output /jre

# Stage 4: Final image
FROM debian:12-slim
WORKDIR /opt/traccar

# Copy backend artifacts
COPY --from=backend-builder /build/target/tracker-server.jar ./
COPY --from=backend-builder /build/target/lib ./lib
COPY --from=backend-builder /build/schema ./schema
COPY --from=backend-builder /build/templates ./templates

# Copy frontend build
COPY --from=frontend-builder /build/build ./web

# Copy translations
COPY --from=frontend-builder /build/src/resources/l10n ./templates/translations

# Copy configuration
RUN mkdir -p ./conf
COPY setup/traccar.xml ./conf/traccar.xml

# Copy JRE
COPY --from=jdk /jre ./jre

# Create necessary directories
RUN mkdir -p data logs

# Expose ports
EXPOSE 8082 5000-5500

# Set entrypoint
ENTRYPOINT ["/opt/traccar/jre/bin/java"]
CMD ["-jar", "tracker-server.jar", "conf/traccar.xml"]

