package com.demo.service;

import com.demo.entity.User;

/**
 * @author liuq
 * @Date 2019/12/9
 */
public interface IUserService {
    /**
     * 通过id获得User
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 通过id去删除User
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 添加user
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 修改User
     * @param user
     * @return
     */
    int updateUser(User user);
}
