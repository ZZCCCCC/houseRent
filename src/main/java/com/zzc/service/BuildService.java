package com.zzc.service;

import com.zzc.entity.Build;
import com.zzc.entity.Estate;
import com.zzc.entity.PageSimple;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/20/14:37
 * @Description:
 */
public interface BuildService {
    PageSimple<Build> selectAll(int currentPage, int pageSize);


    PageSimple<Build> buildByCondition(String estateName,int currentPage,int pageSize);


    void deleteBuild(int buildId);


    void insertBuild(Map<String, Object> map);

    void editeBuild(Map<String, Object> map);

}
