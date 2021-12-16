package com.egg.dao.pojo;

public class Floor {
    private int id;
    private String address;
    private int owner_id;
    private int look;

    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", owner_id=" + owner_id +
                ", look=" + look +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public Floor(int id, String address, int owner_id, int look) {
        this.id = id;
        this.address = address;
        this.owner_id = owner_id;
        this.look = look;
    }

    public Floor() {
    }
}
