package com.empleados.empleado.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private long id;
    @Getter @Setter @Column(name = "usuario")
    private String usuario;
    @Getter @Setter @Column(name = "contraseña")
    private String contraseña;
    @Getter @Setter @Column(name = "email")
    private String email;

}
