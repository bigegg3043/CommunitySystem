package com.egg.service.impl;

import com.egg.dao.impl.UserDaoImpl;
import com.egg.dao.inter.UserDao;
import com.egg.dao.pojo.User;
import com.egg.service.inter.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserServiceImpl() {
        userDao=new UserDaoImpl();
    }

    @Override
    public User isUsing(String username) {
        return null;
    }
}
