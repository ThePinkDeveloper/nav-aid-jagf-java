package com.thepinkdev.navaidjagf.dtos;

public class WeatherInfoDto {

    private String temp;
    private String pressure;
    private String windSpeed;
    private Integer relativeToHeadingWindDirection;
    private String windGust;

    public WeatherInfoDto() {}
    
    public WeatherInfoDto(String temp, String pressure, String windSpeed, Integer relativeToHeadingWindDirection, String windGust) {
        this.temp = temp;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.relativeToHeadingWindDirection = relativeToHeadingWindDirection;
        this.windGust = windGust;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getRelativeToHeadingWindDirection() {
        return relativeToHeadingWindDirection;
    }

    public void setRelativeToHeadingWindDirection (Integer relativeToHeadingWindDirection) {
        this.relativeToHeadingWindDirection = relativeToHeadingWindDirection;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }


    
}
