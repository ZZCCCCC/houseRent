package com.zzc.controller;

import com.zzc.entity.Result;
import com.zzc.entity.userHouse;
import com.zzc.service.UserHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/04/17/13:49
 * @Description:
 */
@RestController
@CrossOrigin
public class UserHouseController {
    @Autowired
    private UserHouseService userHouseService;
    @GetMapping("/selectUserHouse")
    public Result selectAll() {
        List<userHouse> userHouses = userHouseService.selectAll();
        return new Result(1,"success",userHouses);
    }
}
