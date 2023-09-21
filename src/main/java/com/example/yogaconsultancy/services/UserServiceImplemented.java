package com.example.yogaconsultancy.services;

import com.example.yogaconsultancy.exceptions.ResourceNotFoundException;
import com.example.yogaconsultancy.model.User;
import com.example.yogaconsultancy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImplemented implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByID(long id) {
        User user = userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User not Exit with id " + id));
        return user;
    }

    @Override
    public User updateUserByID(long id, User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("User not Exit with id " + id));
        userToUpdate.setName(user.getName());
        userToUpdate.setAge(user.getAge());
        userToUpdate.setEmail(user.getEmail());
        userRepository.save(userToUpdate);

        return userToUpdate;
    }

    @Override
    public User deleteUserByID(long id) {
        User user = userRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("No User exists with id: " + id));
        userRepository.delete(user);

        return user;
    }
}
