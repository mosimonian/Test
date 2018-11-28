package com.example.dao;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserDao extends JpaRepository<User,Long> {
    /*
     * 我们在这里直接继承 JpaRepository
     * 这里面已经有很多现场的方法了
     * 这也是JPA的一大优点
     *
     * */
}
