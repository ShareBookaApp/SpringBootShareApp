-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-03-20 19:19:58.81

-- tables
-- Table: LIBROS
CREATE TABLE LIBROS (
    Id varchar(50) NOT NULL,
    nombre varchar(100) NOT NULL,
    editorial varchar(100) NOT NULL,
    autor varchar(100) NOT NULL,
    imagen blob NOT NULL,
    latitude double(30,30) NOT NULL,
    longitude double(30,30) NOT NULL,
    USUARIOS_email varchar(100) NOT NULL,
    CONSTRAINT LIBROS_pk PRIMARY KEY (Id)
);

-- Table: LIBRO_SOLICITUD
CREATE TABLE LIBRO_SOLICITUD (
    LIBROS_Id varchar(50) NOT NULL,
    SOLICITUDES_Id varchar(50) NOT NULL
);

-- Table: SOLICITUDES
CREATE TABLE SOLICITUDES (
    Id varchar(50) NOT NULL,
    fecha date NOT NULL,
    estado bool NOT NULL,
    CONSTRAINT SOLICITUDES_pk PRIMARY KEY (Id)
);

-- Table: USUARIOS
CREATE TABLE USUARIOS (
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    nombre varchar(100) NOT NULL,
    celular varchar(100) NOT NULL,
    imagen varchar(100) NOT NULL,
    CONSTRAINT USUARIOS_pk PRIMARY KEY (email)
);

-- End of file.

