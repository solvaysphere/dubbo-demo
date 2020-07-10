package com.hpuswl.dubbo.springboot.controller;

import com.hpuswl.dubbo.springboot.bean.Order;
import com.hpuswl.dubbo.springboot.bean.User;
import com.hpuswl.dubbo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public Order hello(){
        User user = new User();
        user.setId(1);
        user.setUsername("李四");
        Order order = userService.buyMovie(user);
        return order;
    }
}
