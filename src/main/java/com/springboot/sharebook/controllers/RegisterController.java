package com.springboot.sharebook.controllers;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.service.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Manuel F. on 3/28/17.
 */
@RestController
@RequestMapping(value= "/registro")
public class RegisterController {

    @Autowired
    RegisterServiceImpl registerService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> registro(@RequestBody Usuario usuario){
        ResponseEntity a;
        try {
            registerService.registerUser(usuario);
            a = new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error creando usuario!",HttpStatus.NOT_ACCEPTABLE);
        }
        return a;
    }

}
