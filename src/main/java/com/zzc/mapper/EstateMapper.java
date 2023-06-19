package com.zzc.mapper;

import com.zzc.entity.Estate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/12/17:05
 * @Description:
 */
@Mapper
public interface EstateMapper {
    List<Estate> selectAll();
    void deleteByEstateId(int EstatedId);
    void estateUpdate(Estate estate);
    List<Estate> selectByCondition(Estate estate);

    void addEaste(Estate buildId);

    List<Estate> cityAllEstate(int id);

    List<Map<String, Integer>> cityCountEstate();

    List<Estate> selectAllEstate();
}
