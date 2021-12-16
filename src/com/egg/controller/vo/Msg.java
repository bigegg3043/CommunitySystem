package com.egg.controller.vo;

public enum Msg {

    SUCCESS_LOGIN(101,"登录成功！"),
    SUCCESS_USING(102,"检查成功！");

    int code;
    String ret;
    Msg(int code,String ret){
        this.code=code;
        this.ret=ret;
    }

    public int getCode() {
        return code;
    }

    public String getRet() {
        return ret;
    }
}
