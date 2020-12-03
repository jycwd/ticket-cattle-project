package com.city.entity;

import java.io.Serializable;


public class City implements Serializable {
//    private static final long serialVersionUID = -53559532330852603L;

    private Integer cityId;
    private String cityName;


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

}