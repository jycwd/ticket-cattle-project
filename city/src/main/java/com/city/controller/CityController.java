package com.city.controller;

import com.city.entity.City;
import com.city.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("city")
public class CityController {

    @Resource
    private CityService cityService;

    @GetMapping("selectOne")
    public City selectOne(Integer id) {
        return this.cityService.queryById(id);
    }

}