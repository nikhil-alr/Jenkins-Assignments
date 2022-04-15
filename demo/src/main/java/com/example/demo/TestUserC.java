package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestUserC {

    @Value("${env}")
    private String message;

    @GetMapping("/Hello")
    public String hello()
    {
        return "Hello world "+message;
    }

    List<User> users = new ArrayList<>();

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        users.add(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return ResponseEntity.ok(users);
    }


}
