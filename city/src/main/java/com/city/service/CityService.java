package com.city.service;

import com.city.entity.City;

import java.util.List;


public interface CityService {

    City queryById(Integer cityId);

    List<City> queryAllByLimit(int offset, int limit);

    City insert(City city);

    City update(City city);

    boolean deleteById(Integer cityId);

}