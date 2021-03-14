package com.kexin.service;

import com.kexin.dao.UserDao;
import com.kexin.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    // 利用组合的概念（创建对象的时候，这个成员对象也随之创建），引入了dao
    // 业务层的目的，就是去调用dao层
    private UserDao userDao;

    // IOC,利用set进行动态实现值得注入！
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
