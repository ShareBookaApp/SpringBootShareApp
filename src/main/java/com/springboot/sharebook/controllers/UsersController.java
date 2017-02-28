package com.springboot.sharebook.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by alejandro on 11/02/17.
 */
@RestController
public class UsersController {

    @RequestMapping("/app/user")
    public Principal user(Principal user) {
        return user;
    }
}
