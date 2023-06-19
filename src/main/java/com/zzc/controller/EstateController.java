package com.zzc.controller;

import com.zzc.entity.*;
import com.zzc.service.CityService;
import com.zzc.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/12/17:02
 * @Description:
 */
@RestController
@CrossOrigin
public class EstateController {
    @Autowired
    private EstateService estateServiceImpl;
    @Autowired
    private CityService cityService;

    @RequestMapping("/estateAll")
    public Result estateAll(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {
        PageSimple<Estate> estatePageSimple = estateServiceImpl.selectAll(currentPage, pageSize);
        return new Result(Code.SUCCESS_LOGIN, "success", estatePageSimple);
    }

    @GetMapping("/deleteEstate")
    public Result deleteEstate(int estateId) {
        estateServiceImpl.deleteByEstateId(estateId);
        return new Result(Code.SUCCESS_LOGIN, "success", null);
    }

    @RequestMapping("estateSelectAllCity")
    public Result estateSelectAllCity() {
        List<City> cities = cityService.estateSelectAllCity();
        return new Result(Code.SUCCESS_LOGIN, "success", cities);
    }

    @PostMapping("/estateUpdate")
    public Result estateUpdate(@RequestBody Estate estate) {
        estateServiceImpl.estateUpdate(estate);
        return new Result(Code.SUCCESS_LOGIN, "success", null);
    }

    @PostMapping("/searchformInline")
    public Result searchformInline(@RequestBody Estate estate) {
        System.out.println(estate);

        List<Estate> estates = estateServiceImpl.selectByCondition(estate);
        return new Result(1, "success", estates);
    }
    @PostMapping("/addEaste")
    public Result addEaste(@RequestBody Estate estate){
        //System.out.println(estate);
        estateServiceImpl.addEaste(estate);
        return  new Result(Code.SUCCESS_LOGIN,"success",null);
    }

}
