package com.dingding.cdc.web;

import com.dingding.cdc.entity.User;
import com.dingding.cdc.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liudingding
 * @date 2019/2/25
 */
@Api(value = "swagger测试")
@RestController
public class Web {

    @Resource
    private LoginService loginService;

    @ApiOperation(value = "查找用户", notes = "通过id来查找")
    @PostMapping("find")
    public User findById(String username) {
        User u = loginService.findByName(username);
        System.out.println(u);
        return u;
    }

    @ApiOperation(value = "删除用户", notes = "通过id来删除")
    @GetMapping("delete")
    public int deleteById(int id) {
        return loginService.deleteById(id);
    }

    @ApiOperation(value = "更新用户", notes = "通过id来更新")
    @PostMapping("update")
    public int updateById(User user) {
        return loginService.updateById(user);
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("insert")
    public void insertUser(User user) {
        loginService.insertUser(user);
    }
}
