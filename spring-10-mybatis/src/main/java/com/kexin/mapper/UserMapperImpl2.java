package com.kexin.mapper;

import com.kexin.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
// 继承抽象类来实现
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
