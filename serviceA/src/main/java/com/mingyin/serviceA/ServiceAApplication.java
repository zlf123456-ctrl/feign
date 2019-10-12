package com.mingyin.serviceA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import zlf.com.User;
@RestController
public class ServiceAApplication {
    public User getById(@PathVariable("id") Long id) {
        System.out.println("查询用户，id=" + id);
        return new User(1L, "张三", 20);
    }
}
