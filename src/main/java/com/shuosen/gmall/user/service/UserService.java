package com.shuosen.gmall.user.service;

import com.shuosen.gmall.user.bean.UserInfo;

import java.util.List;

public interface UserService {

     List<UserInfo> findAll();

     void updateUser(UserInfo userInfo);
}
