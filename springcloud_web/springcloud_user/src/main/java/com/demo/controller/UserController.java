package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuq
 * @Date 2019/12/9
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    /**
     * 通过id获得User
     * @param id
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser(Integer id){
        return userService.getUser(id);
    }


}
