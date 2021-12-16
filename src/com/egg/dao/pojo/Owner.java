package com.egg.dao.pojo;

public class Owner {
    private int id;
    private String name;
    private String phone;
    private String email;
    private int look;
    public Owner() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", look=" + look +
                '}';
    }

    public Owner(int id, String name, String phone, String email, int look) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.look = look;
    }
}
