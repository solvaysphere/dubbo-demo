package com.hpuswl.dubbo.springboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo //开启Dubbo注解配置
@SpringBootApplication
public class DubboSpringbootUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootUserConsumerApplication.class, args);
    }

}
