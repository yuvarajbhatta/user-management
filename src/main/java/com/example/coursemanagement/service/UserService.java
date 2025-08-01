package com.example.coursemanagement.service;

import com.example.coursemanagement.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUsers();
    void register(User user);
    User findByUsername(String username);
}
