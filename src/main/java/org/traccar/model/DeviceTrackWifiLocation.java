package org.traccar.model;

import org.traccar.storage.StorageName;

import java.util.Date;

@StorageName("device_track_wifi_location")
public class DeviceTrackWifiLocation extends BaseModel {

    private long device_id;

    public long getdevice_id() {
        return device_id;
    }

    public void setdevice_id(long device_id) {
        this.device_id = device_id;
    }

    private boolean track_wifi_location;

    public boolean gettrack_wifi_location() {
        return track_wifi_location;
    }

    public void settrack_wifi_location(boolean track_wifi_location) {
        this.track_wifi_location = track_wifi_location;
    }

    private Date changed_tracking_state;

    public Date getchanged_tracking_state() {
        return changed_tracking_state;
    }

    public void setchanged_tracking_state(Date changedTrackingState) {
        this.changed_tracking_state = changedTrackingState;
    }

}

