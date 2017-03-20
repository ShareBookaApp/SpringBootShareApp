package com.springboot.sharebook.repositories;

import com.springboot.sharebook.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Diego on 20/03/2017.
 */
public interface SolicitudRepository extends JpaRepository<Solicitud, String>{
}
