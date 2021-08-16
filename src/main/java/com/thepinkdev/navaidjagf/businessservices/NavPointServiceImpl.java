package com.thepinkdev.navaidjagf.businessservices;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.thepinkdev.navaidjagf.dtos.CompleteWeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.Coord;
import com.thepinkdev.navaidjagf.entities.GpsData;
import com.thepinkdev.navaidjagf.entities.NavPoint;
import com.thepinkdev.navaidjagf.entities.WeatherInfo;
import com.thepinkdev.navaidjagf.mappers.CompleteWeatherInfoMapper;
import com.thepinkdev.navaidjagf.utils.CoordUtils;
import com.thepinkdev.navaidjagf.utils.MathUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavPointServiceImpl implements NavPointService {

    @Autowired CoordUtils coordUtils;
    @Autowired MathUtils mathUtils;
    @Autowired WeatherInfoService weatherInfoService;
    @Autowired CompleteWeatherInfoMapper weatherInfoMapper;

    @Override
    public List<NavPoint> getNavPoints(GpsData gpsData) {

        List<NavPoint> navPointsList = new ArrayList<>();

        Gson gson = new Gson();

        // Distance 15 and 50 km
        // degree -15º / heading / +15º

        // Distances
        final Integer SHORT_DISTANCE = 15;
        final Integer LONG_DISTANCE = 15;

        // Calculate heading
        final Integer HEADING = gpsData.getHeading();

        // Current coord
        Coord currentCoord = new Coord(gpsData.getLatitude(), gpsData.getLongitude());
        String stringifiedJsonWeaherInfoDto_0 = weatherInfoService.getWeatherInfoByCoord(currentCoord);
        CompleteWeatherInfoDto weatherInfoDto_0 = gson.fromJson(stringifiedJsonWeaherInfoDto_0, CompleteWeatherInfoDto.class);
        WeatherInfo weatherInfo_0 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_0);
        NavPoint navPoint_0 = new NavPoint(0, currentCoord, weatherInfo_0);
        navPointsList.add(navPoint_0);

        if (HEADING != null) {

            // Calculate angles
            final Integer HEADING_MINUS_15 = mathUtils.calculateHeadingWithCorrection(HEADING - 15);
            final Integer HEADING_PLUS_15 = mathUtils.calculateHeadingWithCorrection(HEADING + 15);

            // Distance 15km degree -15º
            Coord coord_1 = coordUtils.calculateDestinationPoint(currentCoord, HEADING_MINUS_15, SHORT_DISTANCE);
            String stringifiedJsonWeaherInfoDto_1 = weatherInfoService.getWeatherInfoByCoord(coord_1);
            CompleteWeatherInfoDto weatherInfoDto_1 = gson.fromJson(stringifiedJsonWeaherInfoDto_1, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_1 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_1);
            NavPoint navPoint_1 = new NavPoint(1, currentCoord, weatherInfo_1);
            navPointsList.add(navPoint_1);

            // Distance 15km degree -0º
            Coord coord_2 = coordUtils.calculateDestinationPoint(currentCoord, HEADING, SHORT_DISTANCE);
            String stringifiedJsonWeaherInfoDto_2 = weatherInfoService.getWeatherInfoByCoord(coord_2);
            CompleteWeatherInfoDto weatherInfoDto_2 = gson.fromJson(stringifiedJsonWeaherInfoDto_2, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_2 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_2);
            NavPoint navPoint_2 = new NavPoint(2, currentCoord, weatherInfo_2);
            navPointsList.add(navPoint_2);

            // Distance 15km degree +15º
            Coord coord_3 = coordUtils.calculateDestinationPoint(currentCoord, HEADING_PLUS_15, SHORT_DISTANCE);
            String stringifiedJsonWeaherInfoDto_3 = weatherInfoService.getWeatherInfoByCoord(coord_3);
            CompleteWeatherInfoDto weatherInfoDto_3 = gson.fromJson(stringifiedJsonWeaherInfoDto_3, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_3 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_3);
            NavPoint navPoint_3 = new NavPoint(3, currentCoord, weatherInfo_3);
            navPointsList.add(navPoint_3);

            // Distance 50km degree -15º
            Coord coord_4 = coordUtils.calculateDestinationPoint(currentCoord, HEADING_MINUS_15, LONG_DISTANCE);
            String stringifiedJsonWeaherInfoDto_4 = weatherInfoService.getWeatherInfoByCoord(coord_4);
            CompleteWeatherInfoDto weatherInfoDto_4 = gson.fromJson(stringifiedJsonWeaherInfoDto_4, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_4 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_4);
            NavPoint navPoint_4 = new NavPoint(4, currentCoord, weatherInfo_4);
            navPointsList.add(navPoint_4);

            // Distance 50km degree 0º
            Coord coord_5 = coordUtils.calculateDestinationPoint(currentCoord, HEADING, LONG_DISTANCE);
            String stringifiedJsonWeaherInfoDto_5 = weatherInfoService.getWeatherInfoByCoord(coord_5);
            CompleteWeatherInfoDto weatherInfoDto_5 = gson.fromJson(stringifiedJsonWeaherInfoDto_5, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_5 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_5);
            NavPoint navPoint_5 = new NavPoint(5, currentCoord, weatherInfo_5);
            navPointsList.add(navPoint_5);

            // Distance 50km degree +15º
            Coord coord_6 = coordUtils.calculateDestinationPoint(currentCoord, HEADING_PLUS_15, LONG_DISTANCE);
            String stringifiedJsonWeaherInfoDto_6 = weatherInfoService.getWeatherInfoByCoord(coord_6);
            CompleteWeatherInfoDto weatherInfoDto_6 = gson.fromJson(stringifiedJsonWeaherInfoDto_6, CompleteWeatherInfoDto.class);
            WeatherInfo weatherInfo_6 = weatherInfoMapper.fromDtoToEntity(weatherInfoDto_6);
            NavPoint navPoint_6 = new NavPoint(6, currentCoord, weatherInfo_6);
            navPointsList.add(navPoint_6);
        
        }

        return navPointsList;

    }
    
}
