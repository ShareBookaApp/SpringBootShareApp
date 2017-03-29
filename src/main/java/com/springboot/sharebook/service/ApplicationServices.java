package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Solicitud;

import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 20/03/2017.
 */
public interface ApplicationServices {

    public ArrayList<Libro> traerMisLibros(String useremail);

    public List<Libro> traerLibrosDisponibles(String useremail);

    public InputStream getLibroPicture(String id) throws SQLException;

    public void addLibro(Libro libro, String useremail);

    public void addLibroPicture(InputStream imagen, String idLibro);

    public Libro getLibroById(String idLibro);

    public List<List<Libro>> getSolicitudesUsuario(String useremail);

    public void addSolicitud(Solicitud s, String id1,String id2) throws ParseException;

}
