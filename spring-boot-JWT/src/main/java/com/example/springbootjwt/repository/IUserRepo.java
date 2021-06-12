package com.example.springbootjwt.repository;

import com.example.springbootjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
