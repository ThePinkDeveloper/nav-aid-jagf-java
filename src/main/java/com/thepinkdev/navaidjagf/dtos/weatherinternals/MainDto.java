package com.thepinkdev.navaidjagf.dtos.weatherinternals;

public class MainDto {

    Double temp;
    Double feelsLike;
    Double tempMin;
    Double tempMax;
    Integer pressure;
    Integer humidity;
    Integer mainSeaLevel;
    Integer mainGroundLevel;
    
    public MainDto(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity,
            Integer mainSeaLevel, Integer mainGroundLevel) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.mainSeaLevel = mainSeaLevel;
        this.mainGroundLevel = mainGroundLevel;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getMainSeaLevel() {
        return mainSeaLevel;
    }

    public void setMainSeaLevel(Integer mainSeaLevel) {
        this.mainSeaLevel = mainSeaLevel;
    }

    public Integer getMainGroundLevel() {
        return mainGroundLevel;
    }

    public void setMainGroundLevel(Integer mainGroundLevel) {
        this.mainGroundLevel = mainGroundLevel;
    }
}
