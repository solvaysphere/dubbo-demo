package com.hpuswl.dubbo.service.impl;

import com.hpuswl.dubbo.bean.Movie;
import com.hpuswl.dubbo.service.MovieService;

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
