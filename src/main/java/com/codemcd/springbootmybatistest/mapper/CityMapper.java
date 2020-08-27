package com.codemcd.springbootmybatistest.mapper;

import com.codemcd.springbootmybatistest.config.MainConnection;
import com.codemcd.springbootmybatistest.domain.City;

import java.util.List;

@MainConnection
public interface CityMapper {
    City selectCityById(Long id);
    List<City> selectAllCity();
    void insertCity(City city);
}
