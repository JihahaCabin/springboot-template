package com.example.springboottemplate.service;

import com.example.springboottemplate.entity.User;

import java.util.List;


public interface UserService {

    User getUserName(Integer id);

    Void createUser(User user);

    List<User> findAll();
}
