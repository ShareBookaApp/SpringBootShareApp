package com.springboot.sharebook.repositories;

import com.springboot.sharebook.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by daniel on 7/05/17.
 */
public interface RoleRepository extends JpaRepository<UserRole, String> {

}
