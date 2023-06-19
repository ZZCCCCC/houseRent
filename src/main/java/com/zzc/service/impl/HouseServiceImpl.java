package com.zzc.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.Build;
import com.zzc.entity.House;
import com.zzc.entity.PageSimple;
import com.zzc.entity.userHouse;
import com.zzc.mapper.BuildMapper;
import com.zzc.mapper.HouseMapper;
import com.zzc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/12/12:17
 * @Description:
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;
    @Autowired
    private BuildMapper buildMapper;

    @Override
    public PageSimple<House> findAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<House> all = houseMapper.findAll();
        PageInfo<House> housePageInfo = new PageInfo<>(all);
        PageSimple<House> housePageSimple = new PageSimple<>();
        housePageSimple.setList(housePageInfo.getList());
        housePageSimple.setTotalNumber((int) housePageInfo.getTotal());
        return housePageSimple;
    }

    @Override
    public void deleteHouse(int roomId) {
        houseMapper.deleteHouse(roomId);
    }

    @Override
    public void insertHouse(House house) {
        houseMapper.insertHouse(house);
    }

    @Override
    public List<Build> buildAllByEstateId(int estateId) {
        List<Build> builds = buildMapper.selectAllBUildByEstate(estateId);
        return builds;
    }

    @Override
    public List<House> houseAll() {
        List<House> houses = houseMapper.findAll();
        return houses;
    }

    @Override
    public void inserthouseShow(int roomId, int userId) {
        houseMapper.inserthouseShow(roomId, userId);
    }

    @Override
    public List<House> userOfHouse(int id) {
        List<House> houses = houseMapper.userOfHouse(id);
        return houses;
    }

    @Override
    public void userOfHouseCancel(int id, int roomId) {
        houseMapper.userOfHouseCancel(id,roomId);
    }
}
