package com.example.bbb.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    //主键
    private Integer id;
    private String password;
    private String name;
}
