package com.hpuswl.dubbo.springboot.bean;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 316186399774616025L;
    private String username;
    private Integer movieId;
    private String movieName;
    private Double price;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
