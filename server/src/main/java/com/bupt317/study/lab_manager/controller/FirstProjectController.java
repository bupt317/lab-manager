package com.bupt317.study.lab_manager.controller;

import com.bupt317.study.lab_manager.pojo.mybatis.User;
import com.bupt317.study.lab_manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstProjectController
{
    @Autowired
    UserService userService;

    //登陆验证返回
    @RequestMapping(value = ("/inputtest"),method = RequestMethod.POST)
    public String toInputtest(@RequestParam(value = "username",required = true) String username, @RequestParam(value = "password",required = true) String password, Model model)
    {
        User user=new User();
        int id=Integer.parseInt(password);
        user.setId(id);
        user.setAuthority("M");
        user.setUsername("asdasdasda");
        user.setPassword(username);
        String code=userService.updateuser(user);
        model.addAttribute("code",code);
        return "/outputtest";
    }

    //插入数据返回
    //@RequestMapping(value = ("/inputtest"),method = RequestMethod.POST)
    //public String to

}
