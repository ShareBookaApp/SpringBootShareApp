package com.springboot.sharebook.service;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Solicitud;
import com.springboot.sharebook.model.Usuario;
import com.springboot.sharebook.repositories.LibroRepository;
import com.springboot.sharebook.repositories.SolicitudRepository;
import com.springboot.sharebook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.File;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Diego on 20/03/2017.
 */

@Service
public class ApplicationServicesImpl implements ApplicationServices {

    @Autowired
    private LibroRepository librorepo;
    @Autowired
    private UserRepository userrepo;

    @Autowired
    private SolicitudRepository solirepo;

    @Override
    public ArrayList<Libro> traerMisLibros(String useremail) {
        //Como este deben ser hechos los demas servicios trayendo de los repositorios
        return (ArrayList<Libro>) librorepo.getMisLibrosDisponibles(useremail);
    }

    @Override
    public List<Libro> traerLibrosDisponibles(String useremail) {
        return librorepo.getLibrosDisponibles(useremail);
    }

    @Override
    public InputStream getLibroPicture(String id) throws SQLException {
        return librorepo.getLibroPicture(id).getBinaryStream();
    }

    @Override
    public void addLibro(Libro libro, String useremail) {
        Usuario u = userrepo.findByEmail(useremail);
        libro.setUsuario(u);
        String id = u.getEmail()+libro.getNombre()+libro.getLatitude();
        libro.setId(id.trim());
        librorepo.save(libro);
    }

    @Override
    public void addLibroPicture(InputStream imagen, String idLibro) {
        Libro l = librorepo.findOne(idLibro);
       // l.setImagen();
}

    @Override
    public Libro getLibroById(String idLibro) {
        return librorepo.findOne(idLibro);
    }

    @Override
    public List<List<Libro>> getSolicitudesUsuario(String useremail) {
        List<List<Libro>> listaLibros = new LinkedList<>();
        List<Solicitud> solicitudes = solirepo.getSoliitudesUsuario(useremail);
        for(int i=0; i<solicitudes.size(); i++){
            List<Libro> listSoli = new LinkedList<>();
            listSoli.add(librorepo.findOne(solicitudes.get(i).getLibro1().getId()));
            listSoli.add(librorepo.findOne(solicitudes.get(i).getLibro2().getId()));
            listaLibros.add(listSoli);
        }
        return listaLibros;
    }
}
