package com.springboot.sharebook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Diego on 20/03/2017.
 */

@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @Column(name = "email")
    private String email;

    @NotEmpty
    @JsonIgnore
    @Column(name = "password")
    private String password;
    @NotEmpty
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "celular")
    private String celular;
    @Column(name = "imagen")
    @JsonIgnore
    private Blob imagen;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="USUARIOS_email", referencedColumnName="email")
    private List<UserRole> roles;

    public Usuario(String nombre, String password, String email, String celular, Blob imagen, List<UserRole> roles) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.celular = celular;
        this.imagen = imagen;
        this.roles = roles;
    }

    public Usuario(){
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }


    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

}
