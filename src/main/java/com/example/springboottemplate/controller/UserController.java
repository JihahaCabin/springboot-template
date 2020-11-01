package com.example.springboottemplate.controller;


import com.example.springboottemplate.dto.common.Result;
import com.example.springboottemplate.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/getUser/{id}")
    public Result<User> getUserName(@PathVariable("id") Integer id) {
        User user = new User(id, "haha", 1, "haha@163.com", "12345678901");
        return Result.success(user);
    }

    @PostMapping("/createUser")
    public Result<Void> getUserName(@RequestBody User user) {
        return Result.success(null);
    }

}
