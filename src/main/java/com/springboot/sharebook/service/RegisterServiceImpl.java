package com.springboot.sharebook.service;

import com.springboot.sharebook.model.UserRole;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.RegisterRepository;
import com.springboot.sharebook.repositories.RoleRepository;
import com.springboot.sharebook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by daniel on 7/05/17.
 */
@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void registerUser(Usuario usuario) {
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        usuario.setRoles(roleRepository.findAll());
        userRepository.save(usuario);
    }
}
