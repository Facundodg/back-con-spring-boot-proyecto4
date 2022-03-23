package com.empleados.empleado.dao;

import com.empleados.empleado.models.Empleado;
import com.empleados.empleado.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Usuario> getUsuario() {

        String query = "FROM Usuario";
        return  entityManager.createQuery(query).getResultList();

    }
}
