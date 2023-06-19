package com.zzc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.Estate;
import com.zzc.entity.PageSimple;
import com.zzc.mapper.EstateMapper;
import com.zzc.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/12/17:41
 * @Description:
 */
@Service
public class EstateServiceImpl implements EstateService {

    @Autowired
    private EstateMapper estateMapper;
    @Override
    public PageSimple<Estate> selectAll(int currentPage,int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Estate> estates = estateMapper.selectAll();
        PageInfo<Estate> estatePageInfo = new PageInfo<>(estates);
        PageSimple<Estate> estatePageSimple = new PageSimple<>();
        estatePageSimple.setTotalNumber((int) estatePageInfo.getTotal());
        estatePageSimple.setList(estatePageInfo.getList());
        return estatePageSimple;
    }

    @Override
    public void deleteByEstateId(int EstatedId) {
        estateMapper.deleteByEstateId(EstatedId);
    }

    @Override
    public void estateUpdate(Estate estate) {
        estateMapper.estateUpdate(estate);
    }

    @Override
    public List<Estate> selectByCondition(Estate estate) {
        List<Estate> estates = estateMapper.selectByCondition(estate);
        return estates;
    }

    @Override
    public void addEaste(Estate estate) {
        estateMapper.addEaste(estate);
    }

    @Override
    public List<Estate> cityAllEstate(int id) {
        List<Estate> estates = estateMapper.cityAllEstate(id);
        return estates;
    }

    @Override
    public List<Estate> selectAllEstate() {
        List<Estate> estates = estateMapper.selectAllEstate();
        return estates;
    }
}
