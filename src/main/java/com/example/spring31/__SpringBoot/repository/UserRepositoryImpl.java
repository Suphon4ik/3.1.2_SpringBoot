package com.example.spring31.__SpringBoot.repository;

import com.example.spring31.__SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl {

    private final UserRepository userRepository;

    @Autowired
    public UserRepositoryImpl(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }
}
