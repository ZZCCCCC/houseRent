package com.zzc.service.impl;

import com.zzc.entity.RoomType;
import com.zzc.mapper.RoomTypeMapper;
import com.zzc.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/14/15:05
 * @Description:
 */
@Service
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeMapper roomTypeMapper;
    @Override
    public List<RoomType> findAll() {
        List<RoomType> all = roomTypeMapper.findAll();
        return all;
    }
}
