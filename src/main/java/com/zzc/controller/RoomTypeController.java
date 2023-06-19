package com.zzc.controller;

import com.zzc.entity.Result;
import com.zzc.entity.RoomType;
import com.zzc.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/14/15:04
 * @Description:
 */
@RestController
@CrossOrigin
public class RoomTypeController {
    @Autowired
    private RoomTypeService roomTypeService;
    @GetMapping("RoomTypeAll")
    public Result RoomTypeAll() {
        List<RoomType> all = roomTypeService.findAll();
        return new Result(1,"success",all);
    }
}
