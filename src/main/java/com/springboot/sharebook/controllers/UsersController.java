package com.springboot.sharebook.controllers;

import com.springboot.sharebook.security.auth.JwtAuthenticationToken;
import com.springboot.sharebook.security.model.UserContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alejandro on 11/02/17.
 */
@RestController
public class UsersController {


    @RequestMapping(value="/api/me", method=RequestMethod.GET)
    ResponseEntity<?> login(JwtAuthenticationToken token){
        return ResponseEntity.ok((UserContext) token.getPrincipal());
    }

}
