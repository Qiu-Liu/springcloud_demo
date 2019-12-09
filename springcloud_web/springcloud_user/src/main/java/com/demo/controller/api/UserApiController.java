package com.demo.controller.api;

import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuq
 * @Date 2019/12/9
 */
@RestController
@RequestMapping("/user/api")
public class UserApiController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/getUser")
    public User getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }
    @RequestMapping("/deleteUser")
    public int deleteUser(@RequestParam Integer id){

        return userService.deleteUser(id);
    }
    @RequestMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @RequestMapping("/insertUser")
    public int insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }
}
