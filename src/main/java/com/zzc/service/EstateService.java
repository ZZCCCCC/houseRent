package com.zzc.service;

import com.zzc.entity.Estate;
import com.zzc.entity.PageSimple;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/12/17:40
 * @Description:
 */
public interface EstateService {
    PageSimple<Estate> selectAll(int currentPage, int pageSize);
    void deleteByEstateId(int EstatedId);
    void estateUpdate(Estate estate);
    List<Estate> selectByCondition(Estate estate);
    void addEaste(Estate estate);

    List<Estate> cityAllEstate(int id);

    List<Estate> selectAllEstate();

}
