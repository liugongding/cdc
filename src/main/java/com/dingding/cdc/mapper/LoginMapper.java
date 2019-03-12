package com.dingding.cdc.mapper;

import com.dingding.cdc.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liudingding
 * @date 2016/1/16
 */
@Mapper
public interface LoginMapper {
    /**
     * 通过用户名查询
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
     * 插入一个用户
     * @param user
     */
    void insertUser(User user);


}
