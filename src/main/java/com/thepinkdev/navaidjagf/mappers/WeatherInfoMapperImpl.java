package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.CompleteWeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.WeatherInfo;

import org.springframework.stereotype.Service;

@Service
public class WeatherInfoMapperImpl implements WeatherInfoMapper {

    public WeatherInfo fromDtoToEntity(CompleteWeatherInfoDto completeWeatherInfoDto) {
        WeatherInfo weatherInfo = new WeatherInfo();
        if (completeWeatherInfoDto != null && completeWeatherInfoDto.getMain() != null) {
            weatherInfo.setTemp(completeWeatherInfoDto.getMain().getTemp());
            weatherInfo.setPressure(completeWeatherInfoDto.getMain().getPressure());
        }
        if (completeWeatherInfoDto != null && completeWeatherInfoDto.getWind() != null) {
            weatherInfo.setWindSpeed(completeWeatherInfoDto.getWind().getSpeed());
            weatherInfo.setWindDirection(completeWeatherInfoDto.getWind().getDeg());
            weatherInfo.setWindGust(completeWeatherInfoDto.getWind().getGust());
        }
        return weatherInfo;
    }

    public CompleteWeatherInfoDto fromEntityToDto(WeatherInfo weatherInfo) {
        return null;
    }
    
}
