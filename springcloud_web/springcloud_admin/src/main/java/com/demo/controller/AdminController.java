package com.demo.controller;

import com.demo.entity.User;
import com.demo.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuq
 * @Date 2019/12/9
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserFeign userFeign;
    @RequestMapping("/getUser")
    public User getUserById(Integer id){
        User user = userFeign.getUser(id);
        return user;
    }
    @RequestMapping("/deleteUser")
    public int deleteUser(Integer id){
        return userFeign.deleteUser(id);
    }
    @RequestMapping("/updateUser")

    public int updateUser(@RequestBody User user){
        System.out.println("获得："+user);
        return userFeign.updateUser(user);
    }
    @RequestMapping("/insertUser")
    public int insertUser(@RequestBody User user){
        return userFeign.insertUser(user);
    }
}
