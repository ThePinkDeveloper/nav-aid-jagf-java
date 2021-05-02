package com.thepinkdev.navaidjagf.businessservices;

import java.util.List;

import com.thepinkdev.navaidjagf.jsonentities.NavPointJson;

import org.springframework.stereotype.Service;

import com.thepinkdev.navaidjagf.jsonentities.CoordJson;

@Service
public class NavPointServiceImpl implements NavPointService {

    @Override
    public List<NavPointJson> getNavPoints(CoordJson currentCoord) {
        return null;
    }
    
}
