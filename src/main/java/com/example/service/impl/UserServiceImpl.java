package com.example.service.impl;

import com.example.entity.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDAO;

    @Override
    public List<User> findAll() {
        // 这里我们就可以直接使用 findAll 方法
        return userDAO.findAll();
    }
    public User save(User user){
        return userDAO.save(user);
    }
    public void delete(User user){
        userDAO.delete(user);
    }
    public void update(User user){

    }
}
