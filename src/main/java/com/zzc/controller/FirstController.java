package com.zzc.controller;

import com.zzc.entity.Result;
import com.zzc.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: 赵智超
 * @date: 2023/03/13/15:21
 * @Description:
 */
@CrossOrigin
@RestController
public class FirstController {
    @Autowired
    private FirstService firstService;
    @GetMapping("/count")
    public Result count(){
        List<Map<String, Integer>> maps = firstService.cityCountEstate();
        return new Result(1,"success",maps);
    }
}
