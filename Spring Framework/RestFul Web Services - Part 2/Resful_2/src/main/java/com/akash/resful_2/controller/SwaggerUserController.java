package com.akash.resful_2.controller;

import com.akash.resful_2.model.User;
import com.akash.resful_2.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
@Tag(name = "User API", description = "Operations for managing users")

public class SwaggerUserController {

    private final UserService userService;

    public SwaggerUserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Get user by name")
    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) {
        return userService.getAllUsers().get(0);
    }

    @Operation(summary = "Create new user")
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @Operation(summary = "Delete a user")
    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id) {
        return userService.deleteUserByID(id);
    }
}

