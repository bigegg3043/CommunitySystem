package com.egg.service.impl;

import com.egg.controller.vo.Conse;
import com.egg.dao.factory.DaoFactory;
import com.egg.dao.impl.UserDaoImpl;
import com.egg.dao.inter.UserDao;
import com.egg.dao.pojo.User;
import com.egg.service.inter.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserServiceImpl() {
        userDao= (UserDao) DaoFactory.getInter(Conse.USER);
    }

    //调用UserDao获取User对象返回（判断用户名是否存在）
    @Override
    public User isUsing(String username) {
        User user=null;
        try {
            user = userDao.isUsing(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    //调用UesrDao获取User对象返回（登录）
    @Override
    public User login(String username, String password) {
        User login=null;
        try {
            login = userDao.login(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return login;
    }

    //调用UesrDao获取User的List集合返回（查询所有）
    @Override
    public List<User> selectAllUser() {
        List<User> users=null;
        try {
            users = userDao.selectAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User byid(int id) {
        User user=null;
        try {
            user = userDao.byid(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public String insert(User user) {
        String msg=null;
        try {
            int flag = userDao.insert(user);
            if (flag==1){
                msg = Conse.SUCCESS;
            }else {
                msg=Conse.ERROR;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String update(User user) {
        String msg=null;
        try {
            int flag = userDao.update(user);
            if (flag==1){
                msg = Conse.SUCCESS;
            }else {
                msg = Conse.ERROR;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String delete(User user) {
        String msg=null;
        try {
            int flag = userDao.delete(user);
            if (flag==1){
                msg = Conse.SUCCESS;
            }else {
                msg = Conse.ERROR;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }
}
