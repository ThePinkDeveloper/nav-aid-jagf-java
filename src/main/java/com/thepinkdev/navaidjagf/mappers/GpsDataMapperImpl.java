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
        
        if (!isLatitudeFromGpsEqualsNull(gpsDataDto)) {
            latitude = gpsDataDto.getCoordsDto().getLatitude();
        }

        if (!isLongitudeFromGpsEqualsNull(gpsDataDto)) {
            longitude = gpsDataDto.getCoordsDto().getLongitude();
        }

        if (!isHeadingFromGpsEqualsNull(gpsDataDto)) {
            Double headingAsDouble  = gpsDataDto.getCoordsDto().getHeading();
            heading = Integer.valueOf(headingAsDouble.toString());
        }

        if (latitude != null && longitude != null) {
            return new GpsData(latitude, longitude, heading);
        } else {
            return null;
        }

    }

    private Boolean isLatitudeFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getCoordsDto() == null || gpsDataDto.getCoordsDto().getLatitude() == null;
    }

    private Boolean isLongitudeFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getCoordsDto() == null || gpsDataDto.getCoordsDto().getLongitude() == null;
    }

    private Boolean isHeadingFromGpsEqualsNull(GpsDataDto gpsDataDto) {
        return gpsDataDto == null || gpsDataDto.getCoordsDto() == null || gpsDataDto.getCoordsDto().getHeading() == null;
    }
    
}
