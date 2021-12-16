package com.egg.dao.inter;


import com.egg.dao.pojo.User;

public interface UserDao {
    User isUsing(String username);
}
