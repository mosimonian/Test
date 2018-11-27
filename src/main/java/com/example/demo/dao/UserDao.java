package com.example.demo.dao;

import com.example.demo.domain.User;
import com.example.demo.util.DBUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserDao {
    public String save (String name){
        Connection conn= DBUtil.getConnection();
        String s="insert into user values (null,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(s);
            pst.setString(1, name);
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "添加成功";
    }
}
