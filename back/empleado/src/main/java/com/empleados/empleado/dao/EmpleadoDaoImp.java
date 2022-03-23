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
public class EmpleadoDaoImp implements EmpleadoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Empleado> getEmpleados() {
        String query = "FROM Empleado";
        return  entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(long id) {

        Empleado empleado = entityManager.find(Empleado.class, id);
        entityManager.remove(empleado);

    }


}
