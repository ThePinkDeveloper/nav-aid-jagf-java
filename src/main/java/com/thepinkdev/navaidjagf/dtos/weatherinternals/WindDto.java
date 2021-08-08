package com.thepinkdev.navaidjagf.dtos.weatherinternals;

public class WindDto {

    Double speed;
    Integer deg;
    Double gust;
    
    public WindDto(Double speed, Integer deg, Double gust) {
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }

}
