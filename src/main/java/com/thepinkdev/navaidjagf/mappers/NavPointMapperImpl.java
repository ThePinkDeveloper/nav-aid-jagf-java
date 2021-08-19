package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.CoordDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;
import com.thepinkdev.navaidjagf.dtos.WeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.NavPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavPointMapperImpl implements NavPointMapper {

    @Autowired WeatherInfoMapper weatherInfoMapper;

    @Override
    public NavPointDto fromEntityToDto(NavPoint navPoint, Integer heading) {

        // Mapping id
        NavPointDto navPointDto = new NavPointDto(navPoint.getId());
        
        // Mapping coords
        CoordDto coordDto = new CoordDto();
        coordDto.setLatitude(navPoint.getCoord().getLatitude());
        coordDto.setLongitude(navPoint.getCoord().getLongitude());
        navPointDto.setCoordDto(coordDto);

        // Mapping WeatherInfo
        WeatherInfoDto weatherInfoDto = weatherInfoMapper.fromEntityToDto(navPoint.getWeatherInfo(), heading);
        navPointDto.setWeatherInfoDto(weatherInfoDto);

        return navPointDto;

    }

    
}
