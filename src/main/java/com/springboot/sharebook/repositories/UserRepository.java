package com.springboot.sharebook.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springboot.sharebook.model.Usuario;

/**
 * Created by Diego on 20/03/2017.
 */
public interface UserRepository extends JpaRepository<Usuario,String> {

    //@Query("from Usuario as u where u.email = ?1 and u.password = ?2")
    @Query("from Usuario as u where u.email = ?1")
    Usuario findByEmail(String email);
}
