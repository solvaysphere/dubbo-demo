package com.hpuswl.dubbo.springboot.service;

import com.hpuswl.dubbo.springboot.bean.Order;
import com.hpuswl.dubbo.springboot.bean.User;

public interface UserService {

    Order buyMovie(User user);
}
