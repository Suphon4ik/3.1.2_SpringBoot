package com.example.spring31.__SpringBoot.repository;

import com.example.spring31.__SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
