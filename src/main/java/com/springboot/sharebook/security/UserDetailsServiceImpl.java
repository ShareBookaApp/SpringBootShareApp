package com.springboot.sharebook.security;

import com.springboot.sharebook.model.CurrentUser;
import com.springboot.sharebook.model.Role;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.UserRepository;
import com.springboot.sharebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by alejandro on 22/03/17.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    public CurrentUser loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = userService.getUserByEmail(username);
        return new CurrentUser(user);
    }
}