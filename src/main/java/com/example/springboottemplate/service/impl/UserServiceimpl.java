package com.example.springboottemplate.service.impl;

import com.example.springboottemplate.entity.User;
import com.example.springboottemplate.mapper.UserMapper;
import com.example.springboottemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserName(Integer id) {
        User user = new User(id, "haha", 1, "haha@163.com", "12345678901");
        return user;
    }

    @Override
    public Void createUser(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
