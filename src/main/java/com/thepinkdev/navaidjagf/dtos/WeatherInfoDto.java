package com.thepinkdev.navaidjagf.dtos;

public class WeatherInfoDto {

    private Double temp;
    private Integer pressure;
    private Double windSpeed;
    private Integer windDirection;
    private Double windGust;

    public WeatherInfoDto() {}
    
    public WeatherInfoDto(Double temp, Integer pressure, Double windSpeed, Integer windDirection, Double windGust) {
        this.temp = temp;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.windGust = windGust;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }
    
}
