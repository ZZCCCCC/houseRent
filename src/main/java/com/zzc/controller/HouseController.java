package com.zzc.controller;

import com.zzc.entity.Build;
import com.zzc.entity.House;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Result;
import com.zzc.service.EstateService;
import com.zzc.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author: 赵智超
 * @date: 2023/03/12/12:16
 * @Description:
 */
@RestController
@CrossOrigin
public class HouseController {
    @Autowired
    private HouseService houseService;
    @Autowired
    private EstateService estateService;

    /**
     * 分页查所有的房间
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("housePage")
    public Result housePage(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {
        PageSimple<House> all = houseService.findAll(currentPage, pageSize);
        return new Result(1, "success", all);
    }

    /**
     * 根据id删除房间
     *
     * @param roomId
     * @return
     */
    @DeleteMapping("deleteHouse/{roomId}")
    public Result deleteHouse(@PathVariable int roomId) {
        houseService.deleteHouse(roomId);
        return new Result();
    }

    /**
     * 新增房间
     *
     * @param house
     * @return
     */
    @PostMapping("insertHouse")
    public Result insertHouse(@RequestBody House house) {
        //System.out.println(house);
        houseService.insertHouse(house);
        return new Result(1, "success", null);
    }

    @GetMapping("selectAllEstate")
    public Result selectAllEstate() {
        return new Result(1, "success", estateService.selectAllEstate());
    }

    @GetMapping("buildAll/{estateId}")
    public Result buildAll(@PathVariable int estateId) {
        List<Build> builds = houseService.buildAllByEstateId(estateId);
        return new Result(1, "success", builds);
    }


    @GetMapping("houseAll")
    public Result houseAll() {
        List<House> houses = houseService.houseAll();
        return new Result(1, "success", houses);
    }

    @GetMapping("inserthouseShow")
    public Result inserthouseShow(@RequestParam("roomId") int roomId,@RequestParam("userId") int userId){
        houseService.inserthouseShow(roomId,userId);
        return new Result(1,"success",null);
    }

    @GetMapping("userOfHouse")
    public Result userOfHouse(@RequestParam("id") int id){
        List<House> houses = houseService.userOfHouse(id);
        return new Result(1,"success",houses);
    }

    @GetMapping("userOfHouseCancel")
    public Result userOfHouseCancel(@RequestParam("id")int id,@RequestParam("roomId") int roomId){
        houseService.userOfHouseCancel(id,roomId);
        return new Result(1,"success",null);
    }
}
