package com.dingding.cdc.mapper;

import com.dingding.cdc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.annotation.Resources;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LoginMapperTest {

    @Resource
    private LoginMapper loginMapper;
    @Test
    public void findByName() {
        System.out.println(loginMapper.findByName("liu"));
    }

    @Test
    public void deleteById() {
        int id = 2;
        int a = loginMapper.deleteById(id);
        System.out.println(a);
        System.out.println(loginMapper.deleteById(id));
    }

    @Test
    public void updateById() {
        String username = "li";
        String password = "si";
        Integer id = 1;
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setId(id);
        int a = loginMapper.updateById(u);
        System.out.println(a);
        System.out.println(loginMapper.updateById(u));
    }

    @Test
    public void insertUser() {
        String a = "li";
        String b = "sikssk";
        User u = new User();
        u.setUsername(a);
        u.setPassword(b);
        loginMapper.insertUser(u);
    }
}