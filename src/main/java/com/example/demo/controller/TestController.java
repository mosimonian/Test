package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/person")
public class TestController {
    private final UserRepository userRepository;
    @Autowired
    public TestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public User save (@RequestParam String name){
       // return userService.save(name);
        User user = new User();
        user.setName(name);
        return user;
    }
//    @PostMapping("/person/all")
//    public ConcurrentMap<Integer, User> all (){
//        ConcurrentMap<Integer, User> map = userRepository.getMap();
//        return map;
//    }
//    @PostMapping("/person/update")
//    public ConcurrentMap<Integer, User> update (int id ,String name){
//        userRepository.update(id,name);
//        return userRepository.getMap();
//    }
//    @PostMapping("/person/delete")
//    public ConcurrentMap<Integer, User> delete (int id){
//        userRepository.delete(id);
//        return userRepository.getMap();
//    }

//    @PostMapping("/person/save")
//    public User save (@RequestParam String name){
//        User user = new User();
//        user.setName(name);
//        if (userRepository.save(user)){
//            System.out.println("用户保存成功:"+user);
//        }
//        return user;
//    }
//    @PostMapping("/person/all")
//    public ConcurrentMap<Integer, User> all (){
//        ConcurrentMap<Integer, User> map = userRepository.getMap();
//        return map;
//    }
//    @PostMapping("/person/update")
//    public ConcurrentMap<Integer, User> update (int id ,String name){
//        userRepository.update(id,name);
//        return userRepository.getMap();
//    }
//    @PostMapping("/person/delete")
//    public ConcurrentMap<Integer, User> delete (int id){
//        userRepository.delete(id);
//        return userRepository.getMap();
//    }
}
