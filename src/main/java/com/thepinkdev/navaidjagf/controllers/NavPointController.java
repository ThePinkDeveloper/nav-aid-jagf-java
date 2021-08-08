package com.thepinkdev.navaidjagf.controllers;

import java.util.List;

import com.thepinkdev.navaidjagf.businessservices.NavPointService;
import com.thepinkdev.navaidjagf.businessservices.WeatherInfoService;
import com.thepinkdev.navaidjagf.dtos.GpsDataDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST })
public class NavPointController {

    @Autowired NavPointService navPointService;
    @Autowired WeatherInfoService weatherInfoService;

    // @GetMapping(value = "/navpoints")
    @PostMapping(value = "/navpoints", consumes = "application/json")
    public List<NavPointDto> getNavPoints(@RequestBody GpsDataDto gpsDataDto) {

        navPointService.getNavPoints(gpsData);
        return null;
    }
}
