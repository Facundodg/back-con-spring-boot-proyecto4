package com.empleados.empleado.controllers;

import com.empleados.empleado.dao.EmpleadoDao;
import com.empleados.empleado.dao.UsuarioDao;
import com.empleados.empleado.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){

        System.out.println("entro");
        return usuarioDao.getUsuario();

    }

}
