package com.city.service.impl;

import com.city.dao.CityDao;
import com.city.entity.City;
import com.city.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;


    @Override
    public City queryById(Integer cityId) {
        return this.cityDao.queryById(cityId);
    }


    @Override
    public List<City> queryAllByLimit(int offset, int limit) {

        return this.cityDao.queryAllByLimit(offset, limit);
    }

    @Override
    public City insert(City city) {
        this.cityDao.insert(city);
        return city;
    }


    @Override
    public City update(City city) {
        this.cityDao.update(city);
        return this.queryById(city.getCityId());
    }

    @Override
    public boolean deleteById(Integer cityId) {
        return this.cityDao.deleteById(cityId) > 0;
    }
}