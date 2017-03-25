package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Usuario;
import org.springframework.security.core.userdetails.User;

/**
 * Created by alejandro on 22/03/17.
 */
public interface UserService {
    Usuario getUserByEmail(String email);
}
