package com.egg.dao.pojo;

import java.sql.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private int pri;
    private String img;
    private Date time;
    private int look;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pri=" + pri +
                ", img='" + img + '\'' +
                ", time=" + time +
                ", look=" + look +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public User(int id, String username, String password, int pri, String img, Date time, int look) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.pri = pri;
        this.img = img;
        this.time = time;
        this.look = look;
    }

    public User() {
    }
}
