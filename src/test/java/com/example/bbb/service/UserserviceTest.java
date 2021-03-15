package com.example.bbb.service;

import com.example.bbb.pojo.User;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.github.springtestdbunit.dataset.ReplacementDataSetLoader;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
@DbUnitConfiguration(databaseConnection  = "h2DataSource")
class UserserviceTest {
@Autowired
private  Userservice userservice;

    @Test
    void insert() {
      User user=new User();
      user.setId(1);
      user.setName("张三");
      user.setPassword("333");

      userservice.insert(user);
      Assert.assertEquals("张三",user.getName());

    }
    @Test
    void selectbyid() {
        User user=userservice.selectbyid(1);
        Assert.assertEquals("张三",user.getName());
    }
    @Test
    void selectAll() {
        User user= (User) userservice.selectAll();
        Assert.assertEquals(user,user);
    }




}