package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Solicitud;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.LibroRepository;
import com.springboot.sharebook.repositories.SolicitudRepository;
import com.springboot.sharebook.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 20/03/2017.
 */

@Service
public class ApplicationServicesImpl implements ApplicationServices {

    @Autowired
    private LibroRepository librorepo;
    @Autowired
    private UsuarioRepository userrepo;

    @Autowired
    private SolicitudRepository solirepo;

    @Override
    public ArrayList<Libro> traerMisLibros(String useremail) {
        //Como este deben ser hechos los demas servicios trayendo de los repositorios
        return null;
    }

    @Override
    public List<Libro> traerLibrosDisponibles(String useremail) {
        return librorepo.getLibrosDisponibles(useremail);
    }
}
