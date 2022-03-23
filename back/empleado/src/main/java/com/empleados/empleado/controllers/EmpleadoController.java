package com.empleados.empleado.controllers;

import com.empleados.empleado.dao.EmpleadoDao;
import com.empleados.empleado.models.Empleado;
import com.empleados.empleado.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoDao empleadoDao;

    @RequestMapping(value = "api/empleado/{id}")
    public Empleado getEmpleado(@PathVariable long id) {

        Empleado empleado = new Empleado();

        empleado.setId(123L);
        empleado.setNombre("Facundo");
        empleado.setApellido("Diaz");
        empleado.setSueldo(10000);
        empleado.setAño(2010);

        return empleado;
    }

    @RequestMapping(value = "api/empleados")
    public List<Empleado> getEmpleados() {

        return empleadoDao.getEmpleados();

    }

    @RequestMapping(value = "api/empleado/{id}", method = RequestMethod.DELETE)
    public void eliminarEmpleado(@PathVariable long id) {

        empleadoDao.eliminar(id);

    }

}
