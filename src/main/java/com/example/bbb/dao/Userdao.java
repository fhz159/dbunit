package com.example.bbb.dao;

import com.example.bbb.pojo.User;

import java.util.List;

public interface Userdao {
    List<User> selectAll();

    User selectbyid(Integer id);

    void insert(User user);
}
