package com.empleados.empleado.dao;

import com.empleados.empleado.models.Empleado;

import java.util.List;

public interface EmpleadoDao {

    public List<Empleado> getEmpleados();

    void eliminar(long id);

}
