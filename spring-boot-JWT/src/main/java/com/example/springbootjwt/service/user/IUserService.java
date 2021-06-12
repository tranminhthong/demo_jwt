package com.example.springbootjwt.service.user;

import com.example.springbootjwt.model.User;
import com.example.springbootjwt.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
