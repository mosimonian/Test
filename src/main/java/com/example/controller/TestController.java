package com.example.controller;


import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/user")
public class TestController {
    @Autowired
    private UserService userService;

//    //添加
//    @GetMapping("/save/{name}")
//    public void save(@PathVariable String name ) {
//        User user = new User(name);
//        this.userService.save(user);
//    }

    @RequestMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
    @RequestMapping("/add/{name}")
    public User addUser(@PathVariable String name ){
        User user = new User();

        return userService.save(user);
    }
}