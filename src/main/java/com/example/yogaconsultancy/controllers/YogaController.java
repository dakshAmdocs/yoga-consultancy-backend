package com.example.yogaconsultancy.controllers;

import com.example.yogaconsultancy.model.User;
import com.example.yogaconsultancy.services.UserServiceImplemented;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/users")
public class YogaController {

    @Autowired
    private UserServiceImplemented userServiceImpl;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("/putUsers")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable long id) {
        return ResponseEntity.ok(userServiceImpl.getUserByID(id));
    }

    @PutMapping("/updateByID/{id}")
    public ResponseEntity<User> updateUserByID(@PathVariable long id, @RequestBody User user) {
        return ResponseEntity.ok(userServiceImpl.updateUserByID(id, user));
    }
    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<User> deleteUserByID(@PathVariable long id) {
        return new ResponseEntity<>(userServiceImpl.deleteUserByID(id), HttpStatus.NO_CONTENT);
    }
}