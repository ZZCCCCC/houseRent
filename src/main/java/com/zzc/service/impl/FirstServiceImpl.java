package com.zzc.service.impl;

import com.zzc.mapper.EstateMapper;
import com.zzc.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/03/13/15:53
 * @Description:
 */
@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private EstateMapper estateMapper;
    @Override
    public List<Map<String, Integer>> cityCountEstate() {
        List<Map<String, Integer>> maps = estateMapper.cityCountEstate();
        return maps;
    }
}
