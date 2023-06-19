package com.zzc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.Build;
import com.zzc.entity.Estate;
import com.zzc.entity.PageSimple;
import com.zzc.mapper.BuildMapper;
import com.zzc.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/20/14:37
 * @Description:
 */
@Service
public class BuildServiceImpl implements BuildService {
    @Autowired
    private BuildMapper buildMapper;
    @Override
    public PageSimple<Build> selectAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Build> builds = buildMapper.selectAll();
        PageInfo<Build> buildPageInfo = new PageInfo<>(builds);
        PageSimple<Build> buildPageSimple = new PageSimple<>();
        buildPageSimple.setTotalNumber((int)buildPageInfo.getTotal());
        buildPageSimple.setList(buildPageInfo.getList());
        return buildPageSimple;
    }

    @Override
    public PageSimple<Build> buildByCondition(String estateName,int currentPage,int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Build> builds = buildMapper.buildByCondition(estateName);
        PageInfo<Build> buildPageInfo = new PageInfo<>(builds);
        PageSimple<Build> buildPageSimple = new PageSimple<>();
        buildPageSimple.setTotalNumber((int)buildPageInfo.getTotal());
        buildPageSimple.setList(buildPageInfo.getList());
        return buildPageSimple;
    }

    @Override
    public void deleteBuild(int  buildId) {
        buildMapper.deleteBuild(buildId);
    }

    @Override
    public void insertBuild(Map<String, Object> map) {
        buildMapper.insertBuild(map);
    }

    @Override
    public void editeBuild(Map<String, Object> map) {
        buildMapper.editeBuild(map);
    }

}
