package com.zzc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.zzc.entity.PageSimple;
import com.zzc.entity.User;
import com.zzc.mapper.userMapper;
import com.zzc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/01/31/18:14
 * @Description:
 */
@Service
public class userServiceImpl implements userService {
    @Autowired
    private userMapper userMapper;
    @Override
    public List<User> selectAll() {
        //PageHelper.startPage(2,1);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        //userPageInfo.getTotal();//获取总条数
        //userPageInfo.getPages();//获取总页数
        return userPageInfo.getList();
    }


    @Override
    public User login(User user) {
        user = userMapper.login(user);
        return user;
    }

    @Override
    public PageSimple<User> userPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        PageSimple<User> pageSimple = new PageSimple<>();
        pageSimple.setList(userPageInfo.getList());
        pageSimple.setTotalNumber((int)userPageInfo.getTotal());
        return pageSimple;
    }

    @Override
    public void deleteById(int id) {
        userMapper.deleteById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public Boolean usernameCheck(String username) {
        Boolean b = userMapper.usernameCheck(username);
        return b;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

}
