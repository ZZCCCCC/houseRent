package com.zzc.controller;

import com.zzc.entity.PageSimple;
import com.zzc.entity.Result;
import com.zzc.entity.Code;
import com.zzc.entity.User;
import com.zzc.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 赵智超
 * @date: 2023/01/31/18:10
 * @Description:
 */
//restful风格模式
@RestController
//支持跨域访问此api接口
@CrossOrigin
public class userController {
    @Autowired
    private userService userServiceImpl;

    @RequestMapping("/userAll")
    public Result userAll() {
        List<User> users = userServiceImpl.selectAll();
        return new Result(Code.SUCCESS_LOGIN, "管理员登录成功", users);
    }

    @RequestMapping("/login")
    public Result login(@RequestBody User u) {
        User user = userServiceImpl.login(u);
        if (user != null) {
            return new Result(Code.SUCCESS_LOGIN, "登陆成功", user);
        }
        return new Result(Code.ERROR_LOGIN, "登陆失败", "error");
    }

    /**
     * 分页查询所有的user
     *
     * @param currentPage
     * @param pageSize
     * @return  成功
     */
    @GetMapping("/userPage")
    public Result userPage(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {
        PageSimple<User> userPageSimple = userServiceImpl.userPage(currentPage, pageSize);
        return new Result(Code.SUCCESS_LOGIN, "success", userPageSimple);
    }

    /***
     *
     * @param id
     * @return 成功
     */
    @DeleteMapping("deleteByID/{id}")
    public Result deleteById(@PathVariable int id) {
        userServiceImpl.deleteById(id);
        return new Result(1, "success", null);
    }

    /**
     * 新增用户
     * @param user
     * @return  成功
     */
    @RequestMapping("insertUser")
    public Result insertUser(@RequestBody User user) {
        System.out.println(user);
        userServiceImpl.insertUser(user);
        return new Result(1, "success", null);
    }

    /***
     * 检测用户名是否可以使用
     * @param username
     * @return  成功
     */
    @RequestMapping("usernameCheck")
    public Result usernameCheck(@RequestParam("username") String username) {
        Boolean b = userServiceImpl.usernameCheck(username);
        if (b==null) {
            return new Result(1, "可以使用", null);
        }
        return new Result(0, "已被占用", null);

    }

    /**
     * 修改user
     * @param user
     * @return
     */
    @PostMapping("updateUser")
    public Result updateUser(@RequestBody User user){
        userServiceImpl.updateUser(user);
        return new Result(1,"success",null);
    }

}
