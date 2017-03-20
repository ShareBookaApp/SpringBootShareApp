package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Libro;

import java.util.ArrayList;

/**
 * Created by Diego on 20/03/2017.
 */
public interface ApplicationServices {

    public ArrayList<Libro> traerMisLibros(String useremail);
}
