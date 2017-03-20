package com.springboot.sharebook.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by Diego on 20/03/2017.
 */
public class Usuario implements Serializable {

    private String email;
    private String password;
    private String nombre;
    private String celular;
    private Blob imagen;

    public Usuario(String email, String password, String nombre, String celular, Blob imagen) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.celular = celular;
        this.imagen = imagen;
    }

    public Usuario(){

    }

    @Id
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Column(name = "celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    @Column(name = "imagen")
    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

}
