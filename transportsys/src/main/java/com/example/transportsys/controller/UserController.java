
package com.example.transportsys.controller;

import com.example.transportsys.model.User;
import com.example.transportsys.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/approve/{id}")
    public User approve(@PathVariable Long id) {
        return service.approve(id);
    }
}
