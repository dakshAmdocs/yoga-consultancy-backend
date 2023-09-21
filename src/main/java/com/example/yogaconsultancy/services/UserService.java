package com.example.yogaconsultancy.services;

import com.example.yogaconsultancy.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(User user);

    User getUserByID(long id);

    User updateUserByID(long id, User user);

    User deleteUserByID(long id);
}
