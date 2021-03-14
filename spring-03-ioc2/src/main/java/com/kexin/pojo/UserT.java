package com.kexin.pojo;

public class UserT {
    private String name;

    // 有参构造
    public UserT(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }
}
