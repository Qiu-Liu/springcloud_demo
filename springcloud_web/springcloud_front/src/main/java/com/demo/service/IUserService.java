package com.demo.service;

import com.demo.entity.User;

/**
 * @author liuq
 * @Date 2019/12/3
 */
public interface IUserService {

    User getUser(Integer id);

    void deleteUserById(Integer id);
}
