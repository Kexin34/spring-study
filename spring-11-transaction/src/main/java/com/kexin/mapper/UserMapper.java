package com.kexin.mapper;

import com.kexin.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);

    //根据id删除用户
    public int deleteUser(int id);
}
