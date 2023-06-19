package com.zzc.service;

import com.zzc.entity.PageSimple;
import com.zzc.entity.Role;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/04/22:24
 * @Description:
 */
public interface RoleService {
    PageSimple<Role> selectAll(int curentPage, int pageSize);

    void updateRole(int id,String description);
}
