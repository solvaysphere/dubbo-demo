package com.hpuswl.dubbo.springboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo //开启Dubbo基于注解的配置
@SpringBootApplication
public class DubboSpringbootMovieProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringbootMovieProviderApplication.class, args);
    }

}
