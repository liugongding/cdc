package com.dingding.cdc.service;

import com.dingding.cdc.entity.User;
import com.dingding.cdc.mapper.LoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginServiceTest {

    @Resource
    private LoginMapper loginMapper;
    @Test
    public void findByName() {
        User user = loginMapper.findByName("liu");
        System.out.println(user);
    }

    @Test
    public void deleteById() {

    }

    @Test
    public void updateById() {

    }

    @Test
    public void insertUser() {
        String a = "li";
        String b = "si123sk";
        User u = new User();
        u.setUsername(a);
        u.setPassword(b);
        loginMapper.insertUser(u);
    }
}