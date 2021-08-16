package com.thepinkdev.navaidjagf.controllers;

import java.util.ArrayList;
import java.util.List;

import com.thepinkdev.navaidjagf.businessservices.NavPointService;
import com.thepinkdev.navaidjagf.businessservices.WeatherInfoService;
import com.thepinkdev.navaidjagf.dtos.GpsDataDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;
import com.thepinkdev.navaidjagf.entities.GpsData;
import com.thepinkdev.navaidjagf.entities.NavPoint;
import com.thepinkdev.navaidjagf.mappers.GpsDataMapper;
import com.thepinkdev.navaidjagf.mappers.NavPointMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST })
public class NavPointController {

    @Autowired NavPointService navPointService;
    @Autowired WeatherInfoService weatherInfoService;
    @Autowired GpsDataMapper gpsDataMapper;
    @Autowired NavPointMapper navPointMapper;

    // @GetMapping(value = "/navpoints")
    @PostMapping(value = "/navpoints", consumes = "application/json")
    public List<NavPointDto> getNavPoints(@RequestBody GpsDataDto gpsDataDto) {
        GpsData gpsData = gpsDataMapper.fromDtoToEntity(gpsDataDto);
        if (gpsData != null) {
            List<NavPoint> navPointList = navPointService.getNavPoints(gpsData);
            if (!navPointList.isEmpty()) {
                List<NavPointDto> navPointDtoList = new ArrayList<>();
                navPointList.forEach( navPoint -> {
                    NavPointDto navPointDto = navPointMapper.fromEntityToDto(navPoint, gpsData.getHeading());
                    navPointDtoList.add(navPointDto);
                });
                return navPointDtoList;
            }
        }
        return new ArrayList<>();
    }
}
