package com.zzc.controller;

import com.zzc.entity.City;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Result;
import com.zzc.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/06/15:12
 * @Description:
 */
@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityServiceImpl;
    @RequestMapping("/selectAllCity")
    public Result selectAllCity(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize){
        PageSimple<City> cityPageSimple = cityServiceImpl.selectAll(currentPage, pageSize);
        return new Result(101,"success",cityPageSimple);
    }
    @RequestMapping("/selectByCondition")
    public Result selectByCondition(@RequestBody City city){
        List<City> cities = cityServiceImpl.selectByCondition(city);
        return  new Result(101,"success",cities);
    }
}
