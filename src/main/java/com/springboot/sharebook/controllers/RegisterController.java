package com.springboot.sharebook.controllers;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.service.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by 2087052 on 3/29/17.
 */
@RestController
@RequestMapping(path = "/registrar")
public class RegisterController {

    @Autowired
    ApplicationServices services;

    @RequestMapping(path = "/agregar/{email}", method = RequestMethod.POST)
    public ResponseEntity<?> addRegister(@RequestBody Usuario user, @PathVariable String email){
        ResponseEntity a;
        try {
            services.insertUsuario(user);
            a = new ResponseEntity<>(HttpStatus.ACCEPTED);
            System.out.println("Usuario creado sin error");
        } catch (Exception ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error!",HttpStatus.NOT_ACCEPTABLE);
        }
        return a;
    }
}
