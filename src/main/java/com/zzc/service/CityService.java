package com.zzc.service;

import com.zzc.entity.City;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Role;
import com.zzc.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/06/15:07
 * @Description:
 */
public interface CityService {
    PageSimple<City> selectAll(int curentPage, int pageSize);

    List<City> selectByCondition(City city);

    List<City> estateSelectAllCity();
}
