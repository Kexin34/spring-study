package com.kexin.demo04;

import com.kexin.demo02.UserService;
import com.kexin.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 通过调用程序处理角色来处理我们要调用的接口对象
        pih.setTarget(userService); // 设置要代理的对象

        UserService proxy = (UserService)pih.getProxy(); //动态生成对应的代理类！

        proxy.add();
    }
}
