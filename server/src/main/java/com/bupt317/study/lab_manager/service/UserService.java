package com.bupt317.study.lab_manager.service;

import com.bupt317.study.lab_manager.mapper.UserMapper;
//import org.apache.tomcat.jni.User;
import com.bupt317.study.lab_manager.pojo.mybatis.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//表明这是一个service
@Service
public class UserService
{
    @Autowired
    //自动注入mapper
    private UserMapper userMapper;

    //登陆验证
    //用户名和密码不对返回n，若正确返回权限值
    public String login(String username,String password)
    {
        //User user=new User();
        User user=userMapper.selectbyusername(username);
        if (user==null)
            return "n";
        else if (user.getPassword().equals(password))
            return user.getAuthority();
        else
            return "n";
    }

    //添加用户，成功返回y，否则返回n
    public String adduser(User user)
    {
        int x=userMapper.insertuser(user);
        if (x==1)
            return "y";
        else
            return "n";
    }

    //根据id删除用户，成功返回y，否则返回n
    public String deleteuser(int id)
    {
        int x=userMapper.deletebyid(id);
        if (x==1)
            return "y";
        else
            return "n";
    }

    //根据id更新用户,成功返回y，失败返回n
    public String updateuser(User user)
    {
        int x=userMapper.updatebyid(user);
        if(x==1)
            return "y";
        else
            return "n";
    }

}
