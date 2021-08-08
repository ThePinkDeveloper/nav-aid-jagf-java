package com.thepinkdev.navaidjagf.entities;

public class NavPoint {
    
    private Integer id;
    private Coord coord;
    private WeatherInfo weatherInfo;

    public NavPoint(Integer id, Coord coord, WeatherInfo weatherInfo) {
        this.id = id;
        this.coord = coord;
        this.weatherInfo = weatherInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfo = weatherInfo;
    }

    @Override
    public String toString() {
        return "NavPoint [coord=" + coord + ", id=" + id + ", weatherInfo=" + weatherInfo + "]";
    }

}
