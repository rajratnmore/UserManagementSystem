package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @GetMapping("getUser/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("updateUserInfo")
    public String updateUserInfo(@RequestBody User newUser){
        return userService.updateUserInfo(newUser);
    }

    @DeleteMapping("deleteUser")
    public String deleteUserById(@RequestParam Integer userId){
        return userService.deleteUserById(userId);
    }

}
