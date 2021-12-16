package com.egg.dao.inter;


import com.egg.dao.pojo.User;

import java.util.List;

public interface UserDao {
    User isUsing(String username) throws Exception;
    User login(String username,String password) throws Exception;
    List<User> selectAllUser() throws Exception;
}
