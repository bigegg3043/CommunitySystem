package com.egg.service.impl;

import com.egg.dao.impl.UserDaoImpl;
import com.egg.dao.inter.UserDao;
import com.egg.dao.pojo.User;
import com.egg.service.inter.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserServiceImpl() {
        userDao=new UserDaoImpl();
    }

    //调用UserDao获取User对象返回（判断用户名是否存在）
    @Override
    public User isUsing(String username) {
        return null;
    }

    //调用UesrDao获取User对象返回（登录）
    @Override
    public User login(String username, String password) {
        return null;
    }

    //调用UesrDao获取User的List集合返回（查询所有）
    @Override
    public List<User> selectAllUser() {
        return null;
    }
}
