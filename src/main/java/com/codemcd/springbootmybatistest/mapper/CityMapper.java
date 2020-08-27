package com.codemcd.springbootmybatistest.mapper;

import com.codemcd.springbootmybatistest.domain.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    City selectCityById(Long id);
    List<City> selectAllCity();
    void insertCity(City city);
}
