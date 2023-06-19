package com.zzc.controller;

import com.zzc.entity.PageSimple;
import com.zzc.entity.Result;
import com.zzc.entity.Role;
import com.zzc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/04/22:23
 * @Description:
 */
@RestController
@CrossOrigin
public class RoleController {
    @Autowired
    private RoleService roleServiceImpl;
    @GetMapping("/roleAll")
    public Result roleAll(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize){
        PageSimple<Role> rolePageSimple = roleServiceImpl.selectAll(currentPage, pageSize);
        return new Result(101,"success",rolePageSimple);
    }
    @GetMapping("/updateRole")
    public Result updateRole(@RequestParam("Id")int id,@RequestParam("description") String description){
        roleServiceImpl.updateRole(id,description);
        return new Result(101,"success",null);
    }
}
