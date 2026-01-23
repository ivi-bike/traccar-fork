package org.traccar.model;

import org.traccar.storage.StorageName;

import java.util.Date;

@StorageName("device_wifi_location_fetch_history")
public class DeviceWifiLocationFetchHistory extends BaseModel {

    private long device_id;

    public long getdevice_id() {
        return device_id;
    }

    public void setdevice_id(long device_id) {
        this.device_id = device_id;
    }

    private long event_id;

    public long getevent_id() {
        return event_id;
    }

    public void setevent_id(long event_id) {
        this.event_id = event_id;
    }

    private Double gps_latitude;

    public Double getgps_latitude() {
        return gps_latitude;
    }

    public void setgps_latitude(Double gps_latitude) {
        this.gps_latitude = gps_latitude;
    }

    private Double gps_longitude;

    public Double getgps_longitude() {
        return gps_longitude;
    }

    public void setgps_longitude(Double gps_longitude) {
        this.gps_longitude = gps_longitude;
    }

    private String wifi_data;

    public String getwifi_data() {
        return wifi_data;
    }

    public void setwifi_data(String wifi_data) {
        this.wifi_data = wifi_data;
    }

    private Double wifi_latitude;

    public Double getwifi_latitude() {
        return wifi_latitude;
    }

    public void setwifi_latitude(Double wifi_latitude) {
        this.wifi_latitude = wifi_latitude;
    }

    private Double wifi_longitude;

    public Double getwifi_longitude() {
        return wifi_longitude;
    }

    public void setwifi_longitude(Double wifi_longitude) {
        this.wifi_longitude = wifi_longitude;
    }

    private Double wifi_accuracy;

    public Double getwifi_accuracy() {
        return wifi_accuracy;
    }

    public void setwifi_accuracy(Double wifi_accuracy) {
        this.wifi_accuracy = wifi_accuracy;
    }

    private Date recorded_at;

    public Date getrecorded_at() {
        return recorded_at;
    }

    public void setrecorded_at(Date recorded_at) {
        this.recorded_at = recorded_at;
    }

    private Date created_at;

    public Date getcreated_at() {
        return created_at;
    }

    public void setcreated_at(Date created_at) {
        this.created_at = created_at;
    }

    private String source_type;

    public String getsource_type() {
        return source_type;
    }

    public void setsource_type(String source_type) {
        this.source_type = source_type;
    }

}


