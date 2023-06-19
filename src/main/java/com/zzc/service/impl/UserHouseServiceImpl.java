package com.zzc.service.impl;

import com.zzc.entity.userHouse;
import com.zzc.mapper.UserHouseMapper;
import com.zzc.service.UserHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/04/17/13:52
 * @Description:
 */
@Service
public class UserHouseServiceImpl implements UserHouseService {
    @Autowired
    private UserHouseMapper userHouseMapper;
    @Override
    public List<userHouse> selectAll() {

        List<userHouse> userHouses = userHouseMapper.selectAll();
        //System.out.println("======================="+userHouses);
        return userHouses;
    }
}
