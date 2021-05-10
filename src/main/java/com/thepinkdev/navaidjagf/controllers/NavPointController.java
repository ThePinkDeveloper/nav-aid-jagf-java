package com.thepinkdev.navaidjagf.controllers;

import java.util.List;

import com.thepinkdev.navaidjagf.businessservices.NavPointService;
import com.thepinkdev.navaidjagf.businessservices.WeatherInfoService;
import com.thepinkdev.navaidjagf.entities.Coord;
import com.thepinkdev.navaidjagf.jsonentities.CoordJson;
import com.thepinkdev.navaidjagf.jsonentities.NavPointJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavPointController {

    @Autowired NavPointService navPointService;
    @Autowired WeatherInfoService weatherInfoService;

    @GetMapping(value = "/navpoints")
    public List<NavPointJson> getNavPoints(CoordJson currentCoord) {
        		
		Coord coord = new Coord(Double.valueOf(12.123d), Double.valueOf(123.12d));
		weatherInfoService.getWeatherInfoByCoord(coord);
        return navPointService.getNavPoints(currentCoord);
    }
}
