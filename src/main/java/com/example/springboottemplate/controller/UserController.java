package com.example.springboottemplate.controller;


import com.example.springboottemplate.dto.common.Result;
import com.example.springboottemplate.entity.User;
import com.example.springboottemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUser/{id}")
    public Result<User> getUserName(@PathVariable("id") Integer id) {
        User user = userService.getUserName(id);
        return Result.success(user);
    }

    @PostMapping("/createUser")
    public Result<Void> createUser(@RequestBody User user) {
        userService.createUser(user);
        return Result.success(null);
    }

}
