package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <h1>Created by Mattias on 2017-01-12.</h1>
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userService.getAll();
    }
}
