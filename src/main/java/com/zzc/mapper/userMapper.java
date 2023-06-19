package com.zzc.mapper;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zzc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/01/31/18:11
 * @Description:
 */
@Mapper
public interface userMapper {

    List<User> selectAll();

    User login(User user);

    void deleteById(int id);

    void insertUser(User user);

    Boolean usernameCheck(String username);

    void updateUser(User user);
}
