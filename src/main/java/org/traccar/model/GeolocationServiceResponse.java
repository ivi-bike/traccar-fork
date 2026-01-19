package org.traccar.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

public class GeolocationServiceResponse {

    private Double lat;
    private Double lon;
    @JsonSetter(nulls = Nulls.SKIP)
    private Double accuracy = 0.0;
    private String source;

    public Double getLat() {
          return lat;
    }

    public void setLat(Double lat) {
          this.lat = lat;
    }

    public Double getLon() {
          return lon;
    }

    public void setLon(Double lon) {
          this.lon = lon;
    }

    public Double getAccuracy() {
          return accuracy;
    }

    public void setAccuracy(Double accuracy) {
          this.accuracy = accuracy;
    }

    public String getSource() {
          return source;
    }

    public void setSource(String source) {
          this.source = source;
    }
}
