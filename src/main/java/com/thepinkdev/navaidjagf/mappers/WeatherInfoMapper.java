package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.CompleteWeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.WeatherInfo;

public interface WeatherInfoMapper {
    
    public WeatherInfo fromDtoToEntity(CompleteWeatherInfoDto weatherInfoDto);

}
