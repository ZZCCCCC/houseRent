package com.zzc.mapper;

import com.zzc.entity.RoomType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/14/15:05
 * @Description:
 */
@Mapper
public interface RoomTypeMapper {
    List<RoomType> findAll();
}
