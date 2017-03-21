package com.springboot.sharebook.repositories;


import com.springboot.sharebook.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Diego on 20/03/2017.
 */
public interface LibroRepository extends JpaRepository<Libro,String>{
    @Query("from Libro as l where l.usuario.email != ?1")
    List<Libro> getLibrosDisponibles(String useremail);
}
