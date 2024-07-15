package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.AlumnoDao;
import edu.kevinmohu.models.entities.Alumno;
import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public class AlumnoDaoDataBase implements AlumnoDao {

    @Override
    public void create(Alumno curso) {

    }

    @Override
    public void update(Alumno curso) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Curso find(Integer id) {
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        return null;
    }

    @Override
    public List<Alumno> findByNombre(String nombre) {
        return null;
    }

    @Override
    public List<Alumno> findByEstado(String nombre) {
        return null;
    }
}
