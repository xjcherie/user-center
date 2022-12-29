package com.example.usercenter.controller;

import com.example.usercenter.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/user-center/users")
    public ResponseEntity<Object> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, User.genName(), User.genAge()));
        users.add(new User(2, User.genName(), User.genAge()));
        return ResponseEntity.ok(users);
    }

}
