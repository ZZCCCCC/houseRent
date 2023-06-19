package com.zzc.mapper;

import com.zzc.entity.House;
import com.zzc.entity.userHouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/12/12:16
 * @Description:
 */
@Mapper
public interface HouseMapper {

    List<House> findAll();

    void deleteHouse(int roomId);

    void insertHouse(House house);

    void inserthouseShow(int roomId,int userId);

    List<House> userOfHouse(int id);

    void userOfHouseCancel(int id, int roomId);
}
