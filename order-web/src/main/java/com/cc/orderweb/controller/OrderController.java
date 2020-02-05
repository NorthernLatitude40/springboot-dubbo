package com.cc.orderweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.inteface.service.UserService;
import com.cc.bean.domain.UserAddress;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

//    @Autowired
    @Reference(url="127.0.0.1:20880")
    private UserService userService;
    //    @RequestMapping("trade")
    //    public String trade(){
    //        // 返回一个视图名称叫index.html
    //        return "index";
    //    }
    // http://localhost:8081?userId=1
    @RequestMapping("trade")
    @ResponseBody // 第一个返回json 字符串，fastJson.jar 第二直接将数据显示到页面！
    public List<UserAddress> trade(String userId){
        // 返回一个视图名称叫index.html
        return userService.getUserAddressList(userId);
    }
}
