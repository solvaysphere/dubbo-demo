package com.hpuswl.dubbo.service.impl;

import com.hpuswl.dubbo.bean.Movie;
import com.hpuswl.dubbo.bean.Order;
import com.hpuswl.dubbo.bean.User;
import com.hpuswl.dubbo.service.MovieService;
import com.hpuswl.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    MovieService movieService;

    public MovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public Order buyMovie(User user) {
        //1.获取最新电影
        Movie movie = movieService.getNewMovie();
        System.out.println("服务消费者调用成功》》》》》》》》");
        Order order = new Order();
        order.setUsername(user.getUsername());
        order.setMovieId(movie.getId());
        order.setMovieName(movie.getMovieName());
        order.setPrice(movie.getPrice());
        return order;
    }
}
