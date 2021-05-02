package com.thepinkdev.navaidjagf.businessservices;

import java.util.List;

import com.thepinkdev.navaidjagf.jsonentities.NavPointJson;

import com.thepinkdev.navaidjagf.jsonentities.CoordJson;

public interface NavPointService {
    
    public List<NavPointJson> getNavPoints(CoordJson currentCoord);
}
