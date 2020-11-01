package com.example.springboottemplate.service;

import com.example.springboottemplate.entity.User;


public interface UserService {

    User getUserName(Integer id);

    Void createUser(User user);
}
