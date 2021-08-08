package com.thepinkdev.navaidjagf.entities;

public class GpsData {

    private Double latitude;
    private Double longitude;
    private Integer heading;

    public GpsData(Double latitude, Double longitude, Integer heading) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.heading = heading;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }
}
