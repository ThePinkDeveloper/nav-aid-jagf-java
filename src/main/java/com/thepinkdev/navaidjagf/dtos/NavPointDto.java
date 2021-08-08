package com.thepinkdev.navaidjagf.dtos;

public class NavPointDto {
    
    private Integer id;
    private CoordDto coordDto;
    private WeatherInfoDto weatherInfoDto;

    public NavPointDto(Integer id) {
        this.id = id;
    }

    public NavPointDto(Integer id, CoordDto coordDto, WeatherInfoDto weatherInfoDto) {
        this.id = id;
        this.coordDto = coordDto;
        this.weatherInfoDto = weatherInfoDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CoordDto getCoordDto() {
        return coordDto;
    }

    public void setCoordDto(CoordDto coordDto) {
        this.coordDto = coordDto;
    }

    public WeatherInfoDto getWeatherInfoDto() {
        return weatherInfoDto;
    }

    public void setWeatherInfoDto(WeatherInfoDto weatherInfoDto) {
        this.weatherInfoDto = weatherInfoDto;
    }

    
}
