package ru.netology.authorizationService.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.authorizationService.service.Authorities;
import ru.netology.authorizationService.service.AuthorizationService;
import ru.netology.authorizationService.user.User;

import java.util.*;

@RestController
@RequestMapping("/api/users")
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/{name}")
    public User getUser(@PathVariable String name) {
        return service.getUserByUserName(name);
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}
