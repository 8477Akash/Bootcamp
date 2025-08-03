package com.akash.resful_2.controller;

import com.akash.resful_2.model.User;
import com.akash.resful_2.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // A) POST - Accept XML to create user
    @PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // B) GET - Return XML or JSON list of users
    @GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}