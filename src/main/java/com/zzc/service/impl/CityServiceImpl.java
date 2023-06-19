package com.zzc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.City;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Role;
import com.zzc.mapper.CityMapper;
import com.zzc.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/06/15:09
 * @Description:
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public PageSimple<City> selectAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<City> cities = cityMapper.selectAllCity();
        PageInfo<City> cityPageInfo = new PageInfo<>(cities);
        PageSimple<City> rolePageSimple = new PageSimple<>();
        rolePageSimple.setTotalNumber((int) cityPageInfo.getTotal());
        rolePageSimple.setList(cityPageInfo.getList());
        return rolePageSimple;
    }

    @Override
    public List<City> selectByCondition(City city) {
        List<City> cities = cityMapper.selectByCondition(city);
        return cities;
    }

    @Override
    public List<City> estateSelectAllCity() {
        List<City> cities = cityMapper.selectAllCity();
        return cities;
    }
}
