package com.thepinkdev.navaidjagf.controllers;

import java.util.List;

import com.thepinkdev.navaidjagf.businessservices.NavPointService;
import com.thepinkdev.navaidjagf.jsonentities.CoordJson;
import com.thepinkdev.navaidjagf.jsonentities.NavPointJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavPointController {

    @Autowired
    NavPointService navPointService;

    @GetMapping(value = "/navPoint")
    public List<NavPointJson> getNavPoints(CoordJson currentCoord) {
        return navPointService.getNavPoints(currentCoord);
    }
}
