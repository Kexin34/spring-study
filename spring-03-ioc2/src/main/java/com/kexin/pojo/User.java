package com.kexin.pojo;

public class User {

    private String name;

    // 无参构造（默认存在）
    public User() {
        System.out.println("user无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name );
    }

}