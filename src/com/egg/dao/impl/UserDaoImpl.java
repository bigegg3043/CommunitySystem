package com.egg.dao.impl;

import com.egg.dao.inter.UserDao;
import com.egg.dao.pojo.User;
import com.egg.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    //通过传来的值查用户，返回
    @Override
    public User isUsing(String username) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql="SELECT id,username,password,pri,img,`time`,look FROM users WHERE username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,username);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            User user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("pri"),
                    rs.getString("img"),
                    rs.getDate("time"),
                    rs.getInt("look")
            );
        }
        return null;
    }

    //通过传来的值查用户，返回
    @Override
    public User login(String username, String password) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="SELECT id,username,password,pri,img,`time`,look FROM users WHERE username=? AND password=? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            User user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("pri"),
                    rs.getString("img"),
                    rs.getDate("time"),
                    rs.getInt("look")
            );
        }
        DBUtil.close(rs,ps,conn);
        return null;
    }

    //查到这个用户表所有用户
    @Override
    public List<User> selectAllUser() throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="SELECT id,username,password,pri,img,`time`,look FROM  users";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> users=new ArrayList<User>();
        while (rs.next()){
            User user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("pri"),
                    rs.getString("img"),
                    rs.getDate("time"),
                    rs.getInt("look")
            );
            users.add(user);
        }
        DBUtil.close(rs,ps,conn);
        return users;
    }

    @Override
    public User byid(int id) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="SELECT id,username,password,pri,img,`time`,look FROM users WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        User user=null;
        if (rs.next()){
            user = new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getInt("pri"),
                    rs.getString("img"),
                    rs.getDate("time"),
                    rs.getInt("look")

            );
        }
        return user;
    }

    @Override
    public int insert(User user) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="INSERT INTO users(id,username,password,pri,img,`time`,look) WHERE id=? AND username=?AND password=? AND pri=? AND img=? AND `time`=? AND look=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,user.getId());
        ps.setString(2,user.getUsername());
        ps.setString(3,user.getPassword());
        ps.setInt(4,user.getPri());
        ps.setString(5,user.getImg());
        ps.setDate(6,user.getTime());
        ps.setInt(7,user.getLook());
        int flag = ps.executeUpdate();
        DBUtil.close(null,ps,conn);
        return flag;
    }

    @Override
    public int update(User user) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="UPDATE users SET username=? AND password=? AND pri=? AND img=? AND `time`=? AND look=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        ps.setInt(3,user.getPri());
        ps.setString(4,user.getImg());
        ps.setDate(5,user.getTime());
        ps.setInt(6,user.getLook());
        ps.setInt(7,user.getId());
        int flag = ps.executeUpdate();
        DBUtil.close(null,ps,conn);
        return flag;
    }

    @Override
    public int delete(User user) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql="UPDATE users SET look=0 WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,user.getId());
        int flag = ps.executeUpdate();
        DBUtil.close(null,ps,conn);
        return flag;
    }



}
