package com.example.sell.controller;

import com.example.sell.entity.User;
import com.example.sell.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/insertUser")
    public Integer insertUser(User user){

        return userService.insertUser(user);
    }

    @PostMapping("/updateUser")
    public Integer updateUser(User user){
        return userService.updateUser(user.getUserId(),user.getUserName(),user.getUserPass(),user.getUserPhone(),user.getUserAdd());
    }

    @PostMapping("/deleteUser")
    public Integer deleteUser(@RequestBody Map<String,Object> params){
        return userService.deleteUser((Integer) params.get("userId"),params.get("userName").toString());
    }

    @PostMapping("/getUserAndBooks/{userId}")
    public User getUserAndBooks(@PathVariable("userId") Integer userId){
        return userService.getUserAndBooks(userId);
    }


}
