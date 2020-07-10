package com.hpuswl.dubbo.springboot.service.impl;

import com.hpuswl.dubbo.springboot.bean.Movie;
import com.hpuswl.dubbo.springboot.service.MovieService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service  //dubbo暴露服务
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("X战警");
        movie.setPrice(95.99);
        System.out.println("服务提供者被调用...");
        return movie;
    }
}
