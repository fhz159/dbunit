package com.example.bbb.controller;

import com.example.bbb.pojo.User;
import com.example.bbb.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @GetMapping("users")
    public  String getAll(){
        List<User> users = userservice.selectAll();
        return users.toString();
    }
    @GetMapping("{id}")
    public String getbyid(@PathVariable Integer id){
        User user = userservice.selectbyid(id);
        return user + "";
    }
    @PostMapping
    public  String add(User user){
        userservice.insert(user);
        return "ok";
    }
}
