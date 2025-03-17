package com.example.spring31.__SpringBoot.service;


import com.example.spring31.__SpringBoot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
}
