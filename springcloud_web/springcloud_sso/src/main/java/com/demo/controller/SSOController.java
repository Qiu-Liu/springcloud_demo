package com.demo.controller;

import com.demo.feign.FrontFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuq
 * @Date 2019/12/4
 */
@Controller
@RequestMapping("/sso")
public class SSOController {

    @Autowired
    private FrontFeign frontFeign;

    @RequestMapping("/delete")
    public void delete(Integer id){
        System.out.println("进入sso服务");
        frontFeign.delete(id);
        System.out.println("删除成功");
    }
}
