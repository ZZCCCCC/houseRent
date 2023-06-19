package com.zzc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzc.entity.PageSimple;
import com.zzc.entity.Role;
import com.zzc.mapper.RoleMapper;
import com.zzc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/04/22:25
 * @Description:
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public PageSimple<Role> selectAll(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<Role> roles = roleMapper.selectAll();
        PageInfo<Role> rolePageInfo = new PageInfo<>(roles);
        PageSimple<Role> rolePageSimple = new PageSimple<>();
        rolePageSimple.setTotalNumber((int) rolePageInfo.getTotal());
        rolePageSimple.setList(rolePageInfo.getList());
        return rolePageSimple;
    }

    @Override
    public void updateRole(int id, String description) {
        roleMapper.updateRole(id,description);
    }
}
