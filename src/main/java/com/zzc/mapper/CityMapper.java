package com.zzc.mapper;

import com.zzc.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/06/15:06
 * @Description:
 */
@Mapper
public interface CityMapper {

    List<City> selectAllCity();

    List<City> selectByCondition(City city);
}
