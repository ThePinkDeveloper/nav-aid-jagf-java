package com.thepinkdev.navaidjagf.businessservices;

import java.util.List;

import com.thepinkdev.navaidjagf.dtos.CoordDto;
import com.thepinkdev.navaidjagf.dtos.NavPointDto;

import org.springframework.stereotype.Service;

@Service
public class NavPointServiceImpl implements NavPointService {

    @Override
    public List<NavPointDto> getNavPoints(CoordDto currentCoord) {
        return null;
    }
    
}
