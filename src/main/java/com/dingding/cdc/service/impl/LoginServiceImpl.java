package com.dingding.cdc.service.impl;

import com.dingding.cdc.entity.User;
import com.dingding.cdc.mapper.LoginMapper;
import com.dingding.cdc.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Override
    public User findByName(String username) {
        return loginMapper.findByName(username);
    }

    @Override
    public int deleteById(int id) {
        return loginMapper.deleteById(id);
    }

    @Override
    public int updateById(User user) {
        return loginMapper.updateById(user);
    }

    @Override
    public void insertUser(User user) {
        loginMapper.insertUser(user);
    }
}
