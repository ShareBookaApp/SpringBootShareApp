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
 * Created by estudiante on 3/29/17.
 */

@RestController
@RequestMapping(path = "/solicitud")
public class SolicitudController {

    @Autowired
    ApplicationServices services;

    @RequestMapping(path = "/{username}/usuario", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<List<Libro>>> getSoliUser(@PathVariable String username) {
        try {
            System.out.print("Siiii  "+username+ "  lllllll");
            return ResponseEntity.ok().body(services.getSolicitudesUsuario(username));
        } catch (Exception ex) {
            System.out.print("Noooooo  "+username+ "  lllllll");
            Logger.getLogger(SolicitudController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
