package com.linkup.linkupbackend.controller;

import com.linkup.linkupbackend.model.User;
import com.linkup.linkupbackend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody @Valid User user){
        return userService.saveUser(user);
    }

    @GetMapping("/findall")
    public List<User> findAll(){
        return userService.findAll();
    }
}
