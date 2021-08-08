package com.thepinkdev.navaidjagf.dtos;

import com.thepinkdev.navaidjagf.dtos.gpsinternals.CoordsDto;

public class GpsDataDto {

    private CoordsDto coordsDto;
    private Long timeStamp;

    public GpsDataDto() {}

    public GpsDataDto(CoordsDto coordsDto, Long timeStamp) {
        this.coordsDto = coordsDto;
        this.timeStamp = timeStamp;
    }

    public CoordsDto getCoordsDto() {
        return coordsDto;
    }

    public void setCoordsDto(CoordsDto coordsDto) {
        this.coordsDto = coordsDto;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
