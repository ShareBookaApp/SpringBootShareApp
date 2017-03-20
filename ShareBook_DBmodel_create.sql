-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-03-20 20:00:37.058

-- tables
-- Table: LIBROS
CREATE TABLE LIBROS (
    Id varchar(50) NOT NULL,
    nombre varchar(100) NOT NULL,
    editorial varchar(100) NOT NULL,
    autor varchar(100) NOT NULL,
    imagen blob NULL,
    latitude double(30,30) NOT NULL,
    longitude double(30,30) NOT NULL,
    USUARIOS_email varchar(100) NOT NULL,
    CONSTRAINT LIBROS_pk PRIMARY KEY (Id)
);

-- Table: SOLICITUDES
CREATE TABLE SOLICITUDES (
    fecha date NOT NULL,
    estado bool NOT NULL,
    LIBROS_Id1 varchar(50) NOT NULL,
    Id int NOT NULL,
    LIBROS_Id2 varchar(50) NOT NULL,
    CONSTRAINT SOLICITUDES_pk PRIMARY KEY (Id)
);

-- Table: USUARIOS
CREATE TABLE USUARIOS (
    email varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    nombre varchar(100) NOT NULL,
    celular varchar(100) NOT NULL,
    imagen blob NULL,
    CONSTRAINT USUARIOS_pk PRIMARY KEY (email)
);

-- foreign keys
-- Reference: LIBROS_USUARIOS (table: LIBROS)
ALTER TABLE LIBROS ADD CONSTRAINT LIBROS_USUARIOS FOREIGN KEY LIBROS_USUARIOS (USUARIOS_email)
    REFERENCES USUARIOS (email);

-- Reference: SOLICITUDES_LIBROS (table: SOLICITUDES)
ALTER TABLE SOLICITUDES ADD CONSTRAINT SOLICITUDES_LIBROS FOREIGN KEY SOLICITUDES_LIBROS (LIBROS_Id1)
    REFERENCES LIBROS (Id);

-- Reference: SOLICITUDES_LIBROS (table: SOLICITUDES)
ALTER TABLE SOLICITUDES ADD CONSTRAINT SOLICITUDES_LIBROS FOREIGN KEY SOLICITUDES_LIBROS (LIBROS_Id2)
    REFERENCES LIBROS (Id);

-- End of file.

