package com.springboot.sharebook.repositories;

import com.springboot.sharebook.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by 2087052 on 3/28/17.
 */
public interface RegisterRepository extends JpaRepository<Usuario,String> {

    @Query("select u from Usuario u left join fetch u.roles r where u.email=:email")
    public void registerByEmail(@Param("email") String email);

}
