package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public String save (String name){
        return userDao.save(name);
    }
//    public ConcurrentMap<Integer, User> all (){
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
