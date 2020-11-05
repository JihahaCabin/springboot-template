package com.example.springboottemplate.controller;


import com.example.springboottemplate.dto.common.Result;
import com.example.springboottemplate.entity.User;
import com.example.springboottemplate.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiOperation("查询用户详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true)
    })
    @GetMapping("/getUser/{id}")
    public Result<User> getUserName(@PathVariable("id") Integer id) {
        User user = userService.getUserName(id);
        return Result.success(user);
    }

    @ApiOperation("创建用户")
    @PostMapping("/createUser")
    public Result<Void> createUser(@RequestBody User user) {
        userService.createUser(user);
        return Result.success(null);
    }

}
