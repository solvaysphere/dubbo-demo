package com.hpuswl.dubbo.service;

import com.hpuswl.dubbo.bean.Order;
import com.hpuswl.dubbo.bean.User;

public interface UserService {

    Order buyMovie(User user);
}
