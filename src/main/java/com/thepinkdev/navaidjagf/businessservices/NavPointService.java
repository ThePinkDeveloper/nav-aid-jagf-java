package com.thepinkdev.navaidjagf.businessservices;

import java.util.List;

import com.thepinkdev.navaidjagf.entities.GpsData;
import com.thepinkdev.navaidjagf.entities.NavPoint;

public interface NavPointService {
    
    public List<NavPoint> getNavPoints(GpsData gpsDataDto);
}
