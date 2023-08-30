package com.jwt.user.controller;

import com.jwt.user.models.User.User;
import com.jwt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser(){
        return this.userService.getUsers();
    }
}
