package com.zzc.controller;

import com.zzc.entity.PageSimple;
import com.zzc.entity.Park;
import com.zzc.entity.Result;
import com.zzc.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/03/20/11:50
 * @Description:
 */
@RestController
@CrossOrigin
public class ParkContrroller {
    @Autowired
    private ParkService parkService;

    @GetMapping("parkAll")
    public Result parkAll(@RequestParam("currentPage")int currentPage,@RequestParam("pageSize")int pageSize){
        PageSimple<Park> parkPageSimple = parkService.parkAll(currentPage, pageSize);
        return new Result(1,"success",parkPageSimple);
    }

    @DeleteMapping("delPark/{id}")
    public Result delPark(@PathVariable int id){
        parkService.delPark(id);
        return new Result(1,"success",null);
    }

    @PostMapping("insertPark")
    public Result insertPark(@RequestBody Park park){
        parkService.insertPark(park);
        return new Result(1,"success",null);
    }


    @GetMapping("userParkAll")
    public  Result userParkAll(){
        List<Park> parks =parkService.userParkAll();
        return new Result(1,"success",parks);
    }

    @GetMapping("insertparkShow")
    public Result insertparkShow(@RequestParam("userId") int userId,@RequestParam("parkId") int parkId){
        parkService.insertparkShow(userId,parkId);
        return new Result(1,"success",null);
    }
    @GetMapping("parkShow/{userId}")
    public Result parkShow(@PathVariable int userId){
        List<Park> parks=parkService.parkShow(userId);
        return new Result(1,"success",parks);
    }
    @GetMapping("delParkShow")
    public Result delParkShow(@RequestParam("userId") int userId,@RequestParam("parkId") int parkId){
        parkService.delParkShow(userId,parkId);
        return new Result();
    }
}
