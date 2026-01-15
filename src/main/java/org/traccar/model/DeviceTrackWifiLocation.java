package org.traccar.model;

import org.traccar.storage.StorageName;

import java.util.Date;

@StorageName("device_track_wifi_location")
public class DeviceTrackWifiLocation extends BaseModel {

    private long deviceId;

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    private boolean trackWifiLocation;

    public boolean getTrackWifiLocation() {
        return trackWifiLocation;
    }

    public void setTrackWifiLocation(boolean trackWifiLocation) {
        this.trackWifiLocation = trackWifiLocation;
    }

    private Date changedTrackingState;

    public Date getChangedTrackingState() {
        return changedTrackingState;
    }

    public void setChangedTrackingState(Date changedTrackingState) {
        this.changedTrackingState = changedTrackingState;
    }

}

