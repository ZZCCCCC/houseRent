package com.zzc.controller;

import com.zzc.entity.*;
import com.zzc.service.BuildService;
import com.zzc.service.CityService;
import com.zzc.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/02/20/14:36
 * @Description:
 */
@RestController
@CrossOrigin
public class BulidController {
    @Autowired
    private BuildService buildService;
    @Autowired
    private CityService cityService;
    @Autowired
    private EstateService estateService;

    /**
     * 分页查询
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("/buildAll")
    public Result buildAll(@RequestParam int currentPage, @RequestParam int pageSize) {
        PageSimple<Build> buildPageSimple = buildService.selectAll(currentPage, pageSize);
        return new Result(1, "success", buildPageSimple);
    }

    /**
     * 按条件查询
     *
     * @param
     * @return
     */
    @RequestMapping("/buildByCondition")
    public Result buildByCondition(@RequestParam("estateName") String estateName, @RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {
        PageSimple<Build> buildPageSimple = buildService.buildByCondition(estateName, currentPage, pageSize);
        return new Result(1, "success", buildPageSimple);
    }

    /**
     * 按照id删除
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteBuild/{id}")
    public Result deleteBuildById(@PathVariable int id) {
        buildService.deleteBuild(id);
        return new Result(1, "success", null);
    }


    @GetMapping("/cityAll")
    public Result cityAll() {
        List<City> cities = cityService.estateSelectAllCity();
        return new Result(1, "success", cities);
    }

    @GetMapping("/cityAllEstate/{id}")
    public Result cityAllEstate(@PathVariable int id) {
        List<Estate> estates = estateService.cityAllEstate(id);
        return new Result(1, "success", estates);
    }

    @PostMapping("/insertBuild")
    public Result insertBuild(@RequestBody Map<String, Object> map) {
        //System.out.println(map);
        buildService.insertBuild(map);
        return new Result(1, "success", null);
    }

    @PostMapping("/editeBuild")
    public Result editeBuild(@RequestBody Map<String, Object> map){
        //System.out.println(map);
        buildService.editeBuild(map);
        return new Result(1,"success",null);
    }
}
