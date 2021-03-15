package com.kexin.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {

    public String name;

    @Value("秦疆")
    public void setName(String name) {
        this.name = name;
    }
}