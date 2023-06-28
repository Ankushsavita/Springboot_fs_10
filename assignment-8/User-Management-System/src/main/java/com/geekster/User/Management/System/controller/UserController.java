package com.geekster.User.Management.System.controller;

import com.geekster.User.Management.System.model.User;
import com.geekster.User.Management.System.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUsers(@Valid @RequestBody User user){
        return userService.addUsers(user);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("users/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @PutMapping("user/{userId}")
    public String updateUser(@PathVariable Integer userId, @RequestBody User user){
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("user/remove/{userId}")
    public String removeUser(@PathVariable Integer userId){
        return userService.removeUser(userId);
    }
}
