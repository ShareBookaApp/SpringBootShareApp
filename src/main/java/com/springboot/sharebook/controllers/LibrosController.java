package com.springboot.sharebook.controllers;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.service.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Diego on 21/03/2017.
 */
@RestController
@RequestMapping(path = "/libros")
public class LibrosController {

    @Autowired
    ApplicationServices services;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Libro>> getLibrosDisponibles() {
        try {
            return ResponseEntity.ok().body(services.traerLibrosDisponibles("admin@sharebook.com"));
        } catch (Exception ex) {
            Logger.getLogger(LibrosController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
