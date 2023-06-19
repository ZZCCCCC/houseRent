package com.zzc.mapper;

import com.zzc.entity.Park;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/20/11:51
 * @Description:
 */
@Mapper
public interface ParkMapper {
    List<Park> parkAll();

    void delPark(int id);

    void insertPark(Park park);

    void insertparkShow(int userId,int parkId);

    List<Park> parkShow(int userId);

    void delParkShow(int userId, int parkId);
}
