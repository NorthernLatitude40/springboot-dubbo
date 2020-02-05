package com.cc.usermanage.user.controller;

import com.cc.inteface.service.UserService;
import com.cc.bean.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/find")
    public String find(){
        return "sssss";
    }

}

