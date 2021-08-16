package com.thepinkdev.navaidjagf.mappers;

import java.text.DecimalFormat;

import com.thepinkdev.navaidjagf.dtos.WeatherInfoDto;
import com.thepinkdev.navaidjagf.entities.WeatherInfo;
import com.thepinkdev.navaidjagf.utils.MathUtils;

import org.springframework.beans.factory.annotation.Autowired;

public class WeatherInfoMapperImpl implements WeatherInfoMapper {

    @Autowired MathUtils mathUtils;

    @Override
    public WeatherInfoDto fromEntityToDto(WeatherInfo weatherInfo, Integer heading) {

        DecimalFormat df1dec = new DecimalFormat("###.#");

        WeatherInfoDto weatherInfoDto = new WeatherInfoDto();
        String pressureStr = "N/A";
        String tempStr = "N/A";
        Integer relativeToHeadingWindDirection = null;
        String windSpeedStr = "N/A";
        String windGustStr = "N/A";
    
        Integer pressure = weatherInfo.getPressure();
        if (pressure != null) {
            pressureStr = pressure.toString() + " HPa";
        }

        Double tempKelvin = weatherInfo.getTemp();
        if (tempKelvin != null) {
            Double tempCelsius = mathUtils.fromKelvinToCelsius(tempKelvin);
            tempStr = df1dec.format(tempCelsius) + " °C";
        }

        Integer windDirection = weatherInfo.getWindDirection();
        if (windDirection != null) {
            relativeToHeadingWindDirection = mathUtils.calculateRelativeWindDirectionToHeading(heading, windDirection);
        }

        Double windSpeedMeterPerSecond = weatherInfo.getWindSpeed();
        if (windSpeedMeterPerSecond != null) {
            Double windSpeedKmPerHour = mathUtils.fromMeterPerSecondToKmPerHour(windSpeedMeterPerSecond);
            windSpeedStr = df1dec.format(windSpeedKmPerHour) + " km/h";
        }

        Double windGustMeterPerSecond = weatherInfo.getWindGust();
        if (windGustMeterPerSecond != null) {
            Double windGustKmPerHour = mathUtils.fromMeterPerSecondToKmPerHour(windGustMeterPerSecond);
            windGustStr = df1dec.format(windGustKmPerHour) + " km/h";
        }

        weatherInfoDto.setPressure(pressureStr);
        weatherInfoDto.setTemp(tempStr);
        weatherInfoDto.setRelativeToHeadingWindDirection(relativeToHeadingWindDirection);
        weatherInfoDto.setWindSpeed(windSpeedStr);
        weatherInfoDto.setWindGust(windGustStr);

        return weatherInfoDto;

    }


    
}
