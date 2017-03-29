package com.springboot.sharebook.repositories;

import com.springboot.sharebook.model.Libro;
import com.springboot.sharebook.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Diego on 20/03/2017.
 */
public interface SolicitudRepository extends JpaRepository<Solicitud, String>{

    @Query("from Solicitud as s inner join s.libro2 as l where l.usuario.email = ?1")
    List<Solicitud> getSoliitudesUsuario(String useremail);

    @Query("from Solicitud as s inner join s.libro1 as l where l.usuario.email = ?1")
    List<Solicitud> getPeticionesUsuario(String useremail);
}
