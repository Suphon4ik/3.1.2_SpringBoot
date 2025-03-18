package com.example.spring31.__SpringBoot.repository;

import com.example.spring31.__SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    void saveUser (User user);
    void deleteUserById(Long id);
    void updateUser (User user);
}
