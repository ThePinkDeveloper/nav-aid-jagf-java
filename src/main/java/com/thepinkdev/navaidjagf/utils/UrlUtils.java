package com.thepinkdev.navaidjagf.utils;

import com.thepinkdev.navaidjagf.entities.Coord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UrlUtils {

    @Autowired FileAccessUtils fileAccessUtils;

    public String contructURLForApiCallFromCoord(Coord coord) {
        
        StringBuilder sb = new StringBuilder();
        String apiKey = fileAccessUtils.readFile("./sensitive/.apikey");

        sb.append("http://api.openweathermap.org/data/2.5/weather?lat=");
        sb.append(coord.getLatitude());
        sb.append("&lon=");
        sb.append(coord.getLongitude());
        sb.append("&appid=");
        sb.append(apiKey);

        return sb.toString();

    }
    
}
