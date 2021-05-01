package com.alihanakcam.aamongodbexample.ResttApi;

import com.alihanakcam.aamongodbexample.Business.IUserService;
import com.alihanakcam.aamongodbexample.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAll() {
        return userService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        System.out.println(user);
        return (ResponseEntity<User>) ResponseEntity.ok(userService.save(user));
    }
}
