package com.example.service;


import com.example.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
    void delete(User user);
}