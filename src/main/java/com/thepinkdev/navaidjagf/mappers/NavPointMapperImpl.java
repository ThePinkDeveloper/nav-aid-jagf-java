package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.CoordDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;
import com.thepinkdev.navaidjagf.dtos.WeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.NavPoint;

import org.springframework.stereotype.Service;

@Service
public class NavPointMapperImpl implements NavPointMapper {

    @Override
    public NavPointDto fromEntityToDto(NavPoint navPoint) {
        
        NavPointDto navPointDto = new NavPointDto(navPoint.getId());
        CoordDto coordDto = new CoordDto();
        WeatherInfoDto weatherInfoDto = new WeatherInfoDto();

        coordDto.setLatitude(navPoint.getCoord().getLatitude());
        coordDto.setLongitude(navPoint.getCoord().getLongitude());

        if (navPoint.getWeatherInfo() != null) {
            weatherInfoDto.setPressure(navPoint.getWeatherInfo().getPressure());
            weatherInfoDto.setTemp(navPoint.getWeatherInfo().getTemp());
            weatherInfoDto.setWindDirection(navPoint.getWeatherInfo().getWindDirection());
            weatherInfoDto.setWindGust(navPoint.getWeatherInfo().getWindGust());
            weatherInfoDto.setWindSpeed(navPoint.getWeatherInfo().getWindSpeed());
        }

        navPointDto.setCoordDto(coordDto);
        navPointDto.setWeatherInfoDto(weatherInfoDto);

        return navPointDto;

    }

    
}
