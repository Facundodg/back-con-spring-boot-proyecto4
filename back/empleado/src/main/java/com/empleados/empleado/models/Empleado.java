package com.empleados.empleado.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")

public class Empleado {

    @Id
    @Getter @Setter @Column(name = "id")
    private long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "sueldo")
    private double sueldo;
    @Getter @Setter @Column(name = "año")
    private int año;

}
