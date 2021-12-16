package com.egg.dao.impl;

import com.egg.dao.inter.UserDao;
import com.egg.dao.pojo.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    //通过传来的值查用户，返回
    @Override
    public User isUsing(String username) {
        return null;
    }

    //通过传来的值查用户，返回
    @Override
    public User login(String username, String password) throws Exception {
        return null;
    }

    //查到这个用户表所有用户
    @Override
    public List<User> selectAllUser() throws Exception {
        return null;
    }


}
