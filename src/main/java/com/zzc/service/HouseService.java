package com.zzc.service;

import com.zzc.entity.Build;
import com.zzc.entity.House;
import com.zzc.entity.PageSimple;
import com.zzc.entity.userHouse;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/12/12:16
 * @Description:
 */
public interface HouseService {
    PageSimple<House> findAll(int currentPage, int PageSize);

    void deleteHouse(int roomId);

    void insertHouse(House house);

    List<Build> buildAllByEstateId(int estateId);

    List<House> houseAll();


    void inserthouseShow(int roomId, int userId);

    List<House> userOfHouse(int id);

    void userOfHouseCancel(int id, int roomId);
}
