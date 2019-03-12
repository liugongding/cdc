package com.dingding.cdc.service;

import com.dingding.cdc.entity.User;

/**
 * @author liudingding
 * @date 2019/2/25
 */
public interface LoginService {

    /**
     * 通过姓名查找用户
     * @param username
     * @return
     */
    User findByName(String username);

    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    int deleteById(int id);

    /**
     * 通过id修改用户信息
     * @param user
     * @return
     */
    int updateById(User user);

    /**
     * 添加用户
     * @param uesr
     */
    void insertUser(User uesr);
}
