package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Usuario;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

/**
 * Created by alejandro on 22/03/17.
 */
public interface UserService {
    public Optional<Usuario> getUserByEmail(String email);
}
