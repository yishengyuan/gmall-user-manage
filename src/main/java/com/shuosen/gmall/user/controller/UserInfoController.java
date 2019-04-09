package com.shuosen.gmall.user.controller;

import com.shuosen.gmall.user.bean.UserInfo;
import com.shuosen.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll() {
        return userService.findAll();
    }

    @RequestMapping("update")
    @ResponseBody
    public String updateUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("6");
        userInfo.setName("hah");
        userInfo.setLoginName("atguigu");
        userService.updateUser(userInfo);
        return "ok";
    }

    @RequestMapping("update1")
    @ResponseBody
    public String updateUserInfo1() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("6");
        userInfo.setLoginName("boy -1018");
        userInfo.setLoginName("atguigu");
        userService.updateUser(userInfo);
        return "ok";
    }

    @RequestMapping("del")
    @ResponseBody
    public String deleteUser(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "ok";
    }

}
