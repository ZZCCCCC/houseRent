package com.zzc.service;

import com.zzc.entity.PageSimple;
import com.zzc.entity.Park;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/20/11:52
 * @Description:
 */
public interface ParkService {
    PageSimple<Park> parkAll(int currentPage, int pageSize);

    void delPark(int id);

    void insertPark(Park park);

    List<Park> userParkAll();

    void insertparkShow(int userId,int parkId);

    List<Park> parkShow(int userId);

    void delParkShow(int userId, int parkId);
}
