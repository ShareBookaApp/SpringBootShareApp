package com.springboot.sharebook.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.sharebook.model.Usuario;




/**
 * Created by Diego on 20/03/2017.
 */
public interface UserRepository extends JpaRepository<Usuario,String> {

    @Query("select u from Usuario u left join fetch u.roles r where u.email=:email")
    public Optional<Usuario> findByEmail(@Param("email") String email);
}
