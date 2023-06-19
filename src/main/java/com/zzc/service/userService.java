package com.zzc.service;

import com.zzc.entity.PageSimple;
import com.zzc.entity.User;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/01/31/18:11
 * @Description:
 */

public interface userService {

    List<User> selectAll();

    User login(User user);

    PageSimple<User> userPage(int currentPage, int pageSize);

    void deleteById(int id);

    void insertUser(User user);

    Boolean usernameCheck(String username);

    void updateUser(User user);
}
