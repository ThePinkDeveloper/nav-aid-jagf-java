package com.thepinkdev.navaidjagf.businessservices;

import java.util.List;

import com.thepinkdev.navaidjagf.dtos.CoordDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;

public interface NavPointService {
    
    public List<NavPointDto> getNavPoints(CoordDto currentCoord);
}
