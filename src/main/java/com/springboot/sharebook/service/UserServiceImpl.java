package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Role;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

/**
 * Created by alejandro on 22/03/17.
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Usuario getUserByEmail(String username) {
        return userRepository.findByEmail(username);
    }
}

