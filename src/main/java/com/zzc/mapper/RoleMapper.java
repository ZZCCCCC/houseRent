package com.zzc.mapper;

import com.zzc.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/02/04/22:27
 * @Description:
 */
@Mapper
public interface RoleMapper {

    List<Role> selectAll();
    void updateRole(int id,String description);
}
