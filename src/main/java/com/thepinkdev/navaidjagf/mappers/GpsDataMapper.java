package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.GpsDataDto;
import com.thepinkdev.navaidjagf.entities.GpsData;

public interface GpsDataMapper {
 
    public GpsData fromDtoToEntity(GpsDataDto gpsDataDto);

}
