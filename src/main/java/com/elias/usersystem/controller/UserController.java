package com.elias.usersystem.controller;

import com.elias.usersystem.model.user;
import com.elias.usersystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public user createUser(@Valid @RequestBody user user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<user> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public user updateUser(@PathVariable Long id, @Valid @RequestBody user user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}