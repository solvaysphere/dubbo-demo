package com.hpuswl.dubbo;

import com.hpuswl.dubbo.bean.Order;
import com.hpuswl.dubbo.bean.User;
import com.hpuswl.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        applicationContext.start();

        UserService userService = applicationContext.getBean(UserService.class);
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        Order order = userService.buyMovie(user);
        System.out.println(order);

        System.in.read();
    }
}
