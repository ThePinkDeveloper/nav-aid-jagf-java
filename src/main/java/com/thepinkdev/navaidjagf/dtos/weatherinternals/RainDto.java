package com.thepinkdev.navaidjagf.dtos.weatherinternals;

public class RainDto {

    Integer _1h;
    Integer _3h;
    
    public RainDto(Integer _1h, Integer _3h) {
        this._1h = _1h;
        this._3h = _3h;
    }

    public Integer get_1h() {
        return _1h;
    }

    public void set_1h(Integer _1h) {
        this._1h = _1h;
    }

    public Integer get_3h() {
        return _3h;
    }

    public void set_3h(Integer _3h) {
        this._3h = _3h;
    }
    
}
