package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.CoordDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;
import com.thepinkdev.navaidjagf.dtos.WeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.NavPoint;

import org.springframework.stereotype.Service;

@Service
public class NavPointMapperImpl implements NavPointMapper {

    @Override
    public NavPointDto fromEntityToDto(NavPoint navPoint, Integer heading) {
        
        NavPointDto navPointDto = new NavPointDto(navPoint.getId());
        CoordDto coordDto = new CoordDto();
        WeatherInfoDto weatherInfoDto = new WeatherInfoDto();

        coordDto.setLatitude(navPoint.getCoord().getLatitude());
        coordDto.setLongitude(navPoint.getCoord().getLongitude());



        navPointDto.setCoordDto(coordDto);
        navPointDto.setWeatherInfoDto(weatherInfoDto);

        return navPointDto;

    }

    
}
