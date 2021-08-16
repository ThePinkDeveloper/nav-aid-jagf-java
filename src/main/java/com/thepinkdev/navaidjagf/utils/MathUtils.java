package com.thepinkdev.navaidjagf.utils;

import org.springframework.stereotype.Component;

@Component
public class MathUtils {

    public Integer calculateHeadingWithCorrection(Integer heading) {
        if (heading < 0) {
            heading = 360 - heading;
        } else if (heading > 360) {
            heading = heading - 360;
        }
        return heading;
    }

    public Integer calculateRelativeWindDirectionToHeading(Integer heading, Integer windDirection) {
        Integer result = 0;
        if (windDirection > heading) {
            result = windDirection - heading;
        }
        if (windDirection < heading) {
            result = windDirection - heading + 360;
        }
        return result;
    }
    
    public Double deg2rad(Double angle) {
        return angle * (Math.PI / 180);
    }
    
    public Double rad2deg(Double radians) {
        return radians * (180 / Math.PI);
    }

    public Double fromKelvinToCelsius(Double kelvin) {
        return kelvin - 273.15;
    }

    public Double fromMeterPerSecondToKmPerHour(Double speedMetersPerSecond) {
        return speedMetersPerSecond * 3600 / 1000;
    }

}