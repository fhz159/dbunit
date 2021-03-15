package com.example.bbb.service;

import com.example.bbb.dao.Userdao;
import com.example.bbb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice implements Userdao{
    @Autowired
    private Userdao userdao;

    @Override
    public List<User> selectAll() {
        return userdao.selectAll();
    }

    @Override
    public User selectbyid(Integer id) {
        return userdao.selectbyid(id);
    }

    @Override
    public void insert(User user) {
        userdao.insert(user);
    }
}

