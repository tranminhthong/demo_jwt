package com.example.springbootjwt.repository;

import com.example.springbootjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
