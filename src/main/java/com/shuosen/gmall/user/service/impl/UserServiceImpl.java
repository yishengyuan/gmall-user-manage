package com.shuosen.gmall.user.service.impl;

import com.shuosen.gmall.user.bean.UserInfo;
import com.shuosen.gmall.user.mapper.UserInfoMapper;
import com.shuosen.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();

        return userInfos;
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserInfobyName(String name, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void updateUserInfoByLoginNmae(String loginName, UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("loginName",loginName);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
//        Example example = new Example(UserInfo.class);
//        example.createCriteria().andEqualTo("id",userInfo.getId());
//        userInfoMapper.deleteByExample(example);
        userInfoMapper.deleteByPrimaryKey(userInfo);
    }



}
