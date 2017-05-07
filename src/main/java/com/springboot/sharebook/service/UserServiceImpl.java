package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Optional<Usuario> getUserByEmail(String username) {
        return this.userRepository.findByEmail(username);
    }
}

