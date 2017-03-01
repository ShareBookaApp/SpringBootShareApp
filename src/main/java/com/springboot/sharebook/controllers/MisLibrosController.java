package com.springboot.sharebook.controllers;

import com.springboot.sharebook.model.ManejadorMisLibros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santiago on 20/02/17.
 */

@RestController
@RequestMapping(value= "/libros")
public class MisLibrosController {

    @Autowired
    private ManejadorMisLibros ml;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> manejadorGetMisLibros() {
        try {

            return new ResponseEntity<>(manejadorGetMisLibros(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {


            return new ResponseEntity<>("Error bla bla bla", HttpStatus.NOT_FOUND);
        }
    }
}
