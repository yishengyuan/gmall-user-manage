package com.shuosen.gmall.user.service;

import com.shuosen.gmall.user.bean.UserInfo;

import java.util.List;

public interface UserService {

    //查询所有的用户信息
     List<UserInfo> findAll();

     //修改userInfo对象
     void updateUser(UserInfo userInfo);

     //根据名称进行修改数据
    void updateUserInfobyName(String name,UserInfo userInfo);

    //根据登录名更新用户
    void updateUserInfoByLoginNmae(String loginName,UserInfo userInfo);

    //根据ID删除用户
    void delUser(UserInfo  userInfo);
}
