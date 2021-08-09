package com.thepinkdev.navaidjagf.mappers;

import com.thepinkdev.navaidjagf.dtos.NavPointDto;
import com.thepinkdev.navaidjagf.entities.NavPoint;

public interface NavPointMapper {

    public NavPointDto fromEntityToDto(NavPoint navPoint);
    
}
