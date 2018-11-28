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
    @RequestMapping("/add")
    public User addUser(@Autowired String name ){
        User user = new User();
        user.setName(name);
        return userService.save(user);
    }
    @RequestMapping("/delete")
    public List<User> delete(@Autowired long id){
        User user = new User();
        user.setId(id);
        userService.delete(user);
        return userService.findAll();
    }
}