package com.egg.controller.vo;

public class Res<T> {
    int code;
    String msg;
    int count;
    T data;

    public static Res success(Msg m){
        return new Res(m);
    }
    public static<T> Res<T> success(Msg m,T data){
        return new Res(m,data);
    }

    private Res(Msg m) {
        this.count=1000;
        this.code = m.getCode();
        this.msg = m.getRet();
    }

    public Res(Msg m,T data) {
        this.count=1000;
        this.code = m.getCode();
        this.msg = m.getRet();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getRet() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
