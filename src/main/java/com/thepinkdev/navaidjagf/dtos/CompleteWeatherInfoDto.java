package com.thepinkdev.navaidjagf.dtos;

import java.util.List;

import com.thepinkdev.navaidjagf.dtos.weatherinternals.CloudsDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.MainDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.RainDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.SnowDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.SysDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.WeatherDto;
import com.thepinkdev.navaidjagf.dtos.weatherinternals.WindDto;

public class CompleteWeatherInfoDto {

    CoordDto coord;
    List<WeatherDto> weatherDtoList;
    String base;
    MainDto main;
    WindDto wind;
    CloudsDto clouds;
    RainDto rain;
    SnowDto snow;
    Long dt;
    SysDto sys;
    Long timezone;
    Long id;
    String name;
    Integer code;
    public CompleteWeatherInfoDto(CoordDto coord, List<WeatherDto> weatherDtoList, String base, MainDto main, WindDto wind,
            CloudsDto clouds, RainDto rain, SnowDto snow, Long dt, SysDto sys, Long timezone, Long id, String name,
            Integer code) {
        this.coord = coord;
        this.weatherDtoList = weatherDtoList;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.rain = rain;
        this.snow = snow;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public CoordDto getCoord() {
        return coord;
    }

    public void setCoord(CoordDto coord) {
        this.coord = coord;
    }

    public List<WeatherDto> getWeatherDtoList() {
        return weatherDtoList;
    }

    public void setWeatherDtoList(List<WeatherDto> weatherDtoList) {
        this.weatherDtoList = weatherDtoList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDto getMain() {
        return main;
    }

    public void setMain(MainDto main) {
        this.main = main;
    }

    public WindDto getWind() {
        return wind;
    }

    public void setWind(WindDto wind) {
        this.wind = wind;
    }

    public CloudsDto getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDto clouds) {
        this.clouds = clouds;
    }

    public RainDto getRain() {
        return rain;
    }

    public void setRain(RainDto rain) {
        this.rain = rain;
    }

    public SnowDto getSnow() {
        return snow;
    }

    public void setSnow(SnowDto snow) {
        this.snow = snow;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public SysDto getSys() {
        return sys;
    }

    public void setSys(SysDto sys) {
        this.sys = sys;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    
    

    
}
