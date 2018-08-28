package com.lcq317.program.demo.controller;

import com.lcq317.program.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/u")
public class ProjectController {

    @RequestMapping(value = "/ajax_login", method = RequestMethod.POST)
    @ResponseBody
    public char log(String Username, String password, String authority) {
        var site = 'N';
        if (Username.equals("2018111168") & password.equals("123456") & authority.equals("A")) {
            site = 'Y';
        }
        return site;
    }
}