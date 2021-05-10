package com.thepinkdev.navaidjagf.utils;

import com.thepinkdev.navaidjagf.entities.Coord;

public class CoordUtils {

    /*
    *   All functions taken from https://www.sunearthtools.com/es/tools/distance.php
    */

    public static Double calculateDistanceBetweenTwoCoordsInkms(Coord coordA, Coord coordB)  {

        final Double R = 6372.795477598; // Radius of the earth in km
        final Double LATA = deg2rad(coordA.getLatitude()); // Vertical
        final Double LATB = deg2rad(coordB.getLatitude()); // Vertical
        final Double LONA = deg2rad(coordA.getLongitude()); // Horizontal
        final Double LONB = deg2rad(coordB.getLongitude()); // Horizontal
    
        // Calculate distance between geodesical coord A and geodesical coord B)
        // Dist = R * arccos(sin(LATA) * sin(LATB) + cos(LATA) * cos(LATB) * cos(LONA - LONB))
        //                   _________   ________    _________________   ___________________
        //                            \ /                             \ /                 
        //                             a                               b
        //            _______________________________   ____________________________________
        //                                           \ /  
        //                                            c
    
        final Double a = Math.sin(LATA) * Math.sin(LATB);
        final Double b = Math.cos(LATA) * Math.cos(LATB) * Math.cos(LONA - LONB);
        final Double c = Math.acos(a + b);
        return R * c;
    }
    
    public static Double calculateDirectionBetweenTwoCoordsInDegrees(Coord coordA, Coord coordB) {
    
        final Double LATA = deg2rad(coordA.getLatitude()); // Vertical
        final Double LATB = deg2rad(coordB.getLatitude()); // Vertical
        final Double LONA = deg2rad(coordA.getLongitude()); // Horizontal
        final Double LONB = deg2rad(coordB.getLongitude()); // Horizontal
    
        // To determine the direction from the starting point between two points on the earth, 
        // use the following formula:
        //
        // Δφ = ln( tan( latB / 2 + π / 4 ) / tan( latA / 2 + π / 4) )
        // Δlon = abs( lonA - lonB )
        // θ = atan2( Δlon ,  Δφ )
    
        // Δφ
        final Double dFi = Math.log(Math.tan(LATB / 2 + Math.PI / 4) / Math.tan(LATA / 2 + Math.PI / 4));
        
        // Δlon
        final Double dLon = Math.abs(LONA - LONB);
        
        // θ
        Double heading = rad2deg(Math.atan2(dFi, dLon)) - 90;

        // If angle is a negative one convert it to positive
        heading = heading < 0 ? heading += 360 : heading;
        // If angle is 360º convert it to 0º
        heading = heading == 360 ? 0.0 : heading;

        return heading;
    }
    
    public static Coord calculateDestinationPoint(Coord coord, Double heading, Double distanceInKm) {
    
        final Double R = 6372.795477598; // Radius of the earth in km
        final Double LATA = deg2rad(coord.getLatitude());
        final Double LONA = deg2rad(coord.getLatitude());
    
        // To determine the destination point, knowing the starting point the direction θ and the distance d, 
        // we use the following formula:
    
        // latB = asin( sin( latA) * cos( d / R ) + cos( latA ) * sin( d / R ) * cos( θ ))
        // lonB = lonA + atan2(sin( θ ) * sin( d / R ) * cos( latA ), cos( d / R ) − sin( latA ) * sin( latB ))
    
        final Double headingRads = deg2rad(heading);

        // latitude Coord B
        final Double LATB = Math.asin(Math.sin(LATA) * Math.cos(distanceInKm / R) +
            Math.cos(LATA) * Math.sin(distanceInKm / R) * Math.cos(headingRads));
        // longitude Coord B
        final Double LONB = LONA +
            Math.atan2(Math.sin(headingRads) * Math.sin(distanceInKm / R) * Math.cos(LATA),
                Math.cos(distanceInKm / R) - Math.sin(LATA) * Math.sin(LATB));
        
        // Coord B
        return new Coord(rad2deg(LATB), rad2deg(LONB));
    }
    
    private static Double deg2rad(Double angle) {
        return angle * (Math.PI / 180);
    }
    
    private static Double rad2deg(Double radians) {
        return radians * (180 / Math.PI);
    }
    
    
}
