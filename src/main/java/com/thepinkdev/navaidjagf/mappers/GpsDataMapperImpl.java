package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.GpsDataDto;
import com.thepinkdev.navaidjagf.entities.GpsData;

import org.springframework.stereotype.Service;

@Service
public class GpsDataMapperImpl implements GpsDataMapper {

    @Override
    public GpsData fromDtoToEntity(GpsDataDto gpsDataDto) {

        Double latitude = null;
        Double longitude = null;
        Integer heading = null;
        Double speed = null;
        
        if (!isLatitudeFromGpsEqualsNull(gpsDataDto)) {
            latitude = gpsDataDto.getLatitude();
        }

        if (!isLongitudeFromGpsEqualsNull(gpsDataDto)) {
            longitude = gpsDataDto.getLongitude();
        }

        if (!isHeadingFromGpsEqualsNull(gpsDataDto)) {
            heading = Integer.valueOf(gpsDataDto.getHeading().toString());
        }

        if (!isSpeedFromGpsEqualsNull(gpsDataDto)) {
            speed = gpsDataDto.getSpeed();
        }

        if (latitude != null && longitude != null) {
            return new GpsData(latitude, longitude, heading, speed);
        } else {
            return null;
        }

    }

    private Boolean isLatitudeFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getLatitude() == null;
    }

    private Boolean isLongitudeFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getLongitude() == null;
    }

    private Boolean isHeadingFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getHeading() == null;
    }

    private Boolean isSpeedFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getSpeed() == null;
    }
    
}
