package com.zzc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Park;
import com.zzc.mapper.ParkMapper;
import com.zzc.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/20/11:52
 * @Description:
 */
@Service
public class ParkServiceImpl implements ParkService {
    @Autowired
    private ParkMapper parkMapper;
    @Override
    public PageSimple<Park> parkAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Park> parks = parkMapper.parkAll();
        PageInfo<Park> parkPageInfo = new PageInfo<>(parks);
        PageSimple<Park> parkPageSimple = new PageSimple<>();
        parkPageSimple.setTotalNumber((int)parkPageInfo.getTotal());
        parkPageSimple.setList(parkPageInfo.getList());
        return parkPageSimple;
    }

    @Override
    public void delPark(int id) {
        parkMapper.delPark(id);
    }

    @Override
    public void insertPark(Park park) {
        parkMapper.insertPark(park);
    }

    @Override
    public List<Park> userParkAll() {
        List<Park> parks = parkMapper.parkAll();
        return parks;
    }

    @Override
    public void insertparkShow(int userId,int parkId) {
        parkMapper.insertparkShow(userId,parkId);
    }

    @Override
    public List<Park> parkShow(int userId) {
        List<Park> park=parkMapper.parkShow(userId);
        return park;
    }

    @Override
    public void delParkShow(int userId, int parkId) {
        parkMapper.delParkShow(userId,parkId);
    }
}
