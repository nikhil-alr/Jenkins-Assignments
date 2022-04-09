package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestUserC {

    @GetMapping("/Hello")
    public String hello()
    {
        return "hello ka    jjjj";
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
