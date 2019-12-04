package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuq
 * @Date 2019/12/3
 */
@Controller
@RequestMapping("/front")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    public String getUser(Integer id){
        User user=userService.getUser(id);
        return "index";
    }
    @RequestMapping(value = "/delete")
    public void deleteUser( @RequestParam("id") Integer id){
        System.out.println(id);
        userService.deleteUserById(id);
    }

}
