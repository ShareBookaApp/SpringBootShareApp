package com.springboot.sharebook.controllers;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.service.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Diego on 28/03/2017.
 */
@RestController
@RequestMapping(path = "/solicitudes")
public class SolicitudesController {

    @Autowired
    ApplicationServices services;

    @RequestMapping(path = "/{useremail}/usuario", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<List<Libro>>> getSolicitudesUsuario(@PathVariable String username) {
        try {
            System.out.print("Siiii  "+username+ "  lllllll");
            return ResponseEntity.ok().body(services.getSolicitudesUsuario(username + ".com"));
        } catch (Exception ex) {
            Logger.getLogger(SolicitudesController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}