package com.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liuq
 * @Date 2019/12/4
 */
@FeignClient(value = "web-front")
public interface FrontFeign {
    @RequestMapping(value = "/front/delete")
    void delete( @RequestParam("id") Integer id);
}
