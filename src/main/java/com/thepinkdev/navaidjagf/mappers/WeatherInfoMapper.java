package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.WeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.WeatherInfo;

public interface WeatherInfoMapper {
    
    public WeatherInfoDto fromEntityToDto(WeatherInfo weatherInfo, Integer Heading);

}
