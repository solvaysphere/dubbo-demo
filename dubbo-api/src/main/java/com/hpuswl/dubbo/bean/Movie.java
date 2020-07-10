package com.hpuswl.dubbo.bean;

import java.io.Serializable;

public class Movie implements Serializable {
    private static final long serialVersionUID = 3814224127507986591L;
    private Integer id;
    private String movieName;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
