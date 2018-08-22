package com.bupt317.study.lab_manager.mapper;

import com.bupt317.study.lab_manager.pojo.mybatis.User;
import org.springframework.stereotype.Repository;

@Repository
//将mapper对象声明为托管对象
public interface UserMapper
{
    //根据用户名查询
    User selectbyusername(String username);

    //插入用户
    int insertuser(User user);

    //根据id删除用户
    int deletebyid(int id);

    //根据id更新用户权限和密码
    int updatebyid(User user);

}
