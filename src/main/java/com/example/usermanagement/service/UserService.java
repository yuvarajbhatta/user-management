package com.example.usermanagement.service;

import com.example.usermanagement.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
}