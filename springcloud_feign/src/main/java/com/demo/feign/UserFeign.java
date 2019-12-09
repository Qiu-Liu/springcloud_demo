package com.demo.feign;

import com.demo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuq
 * @Date 2019/12/9
 */
@FeignClient(value = "web-user")
@RestController
@RequestMapping("/user/api")
public interface UserFeign {
    /**
     * api,修改User
     * @param id
     * @return
     */
    @RequestMapping("/getUser")
    User getUser(@RequestParam("id") Integer id);

    /**
     * api，删除User
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser")
    int deleteUser(@RequestParam("id") Integer id);

    /**
     * api，修改User
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    int updateUser(@RequestBody User user);

    /**
     * api,添加User
     * @param user
     * @return
     */
    @RequestMapping("/insertUser")
    int insertUser(@RequestBody User user);

}
