package com.egg.service.inter;

import com.egg.dao.pojo.User;

import java.util.List;

public interface UserService {
    User isUsing(String username);
    User login(String username,String password);
    List<User> selectAllUser();
    User byid(int id);
    String insert(User user);
    String update(User user);
    String delete(User user);
}
