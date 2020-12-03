package com.city.dao;



import com.city.entity.City;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface CityDao {
    City queryById(Integer cityId);
    List<City> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
    List<City> queryAll(City city);
    int insert(City city);
    int insertBatch(@Param("entities") List<City> entities);
    int insertOrUpdateBatch(@Param("entities") List<City> entities);
    int update(City city);
    int deleteById(Integer cityId);
}