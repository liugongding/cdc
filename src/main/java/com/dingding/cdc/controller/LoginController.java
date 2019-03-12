package com.dingding.cdc.controller;

import com.dingding.cdc.dto.Result;
import com.dingding.cdc.dto.ResultCod;
import com.dingding.cdc.entity.User;
import com.dingding.cdc.exception.MyException;
import com.dingding.cdc.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private LoginService loginService;

    /**
     * 跨域登陆
     *
     * @param username
     * @param password
     * @return
     */

    @RequestMapping(value = "login")
    public ResultCod login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        User user = loginService.findByName(username);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return new ResultCod(com.dingding.cdc.enums.ResultCode.SUCCESS);
            }
        }
        return new ResultCod(com.dingding.cdc.enums.ResultCode.FAIL);
    }

    @CrossOrigin
    @RequestMapping(value = "exception")
    @ResponseBody
    public String test() throws Exception {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new MyException("error");
        }
        return "l";
    }

    /**
     * 文件上传
     *
     * @param file
     * @param request
     * @return
     */
    @CrossOrigin
    @RequestMapping(value = "upload")
    @ResponseBody
    public Result upload(MultipartFile file, HttpServletRequest request) {
        try {
            if (file.isEmpty()) {
                return new Result(false, "上传文件为空");
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 设置文件存储路径
            String filePath = "H:/picture/";
            String path = filePath + fileName;
            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                // 新建文件夹
                dest.getParentFile().mkdirs();
            }
            // 文件写入
            file.transferTo(dest);
            return new Result(true, "上传成功");
        } catch (IllegalStateException e) {
            logger.error(e.getMessage());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return new Result(false, "上传失败");
    }

}
