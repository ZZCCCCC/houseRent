package com.zzc.mapper;

import com.zzc.entity.userHouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/04/17/13:50
 * @Description:
 */
@Mapper
public interface UserHouseMapper {

    List<userHouse> selectAll();
}
