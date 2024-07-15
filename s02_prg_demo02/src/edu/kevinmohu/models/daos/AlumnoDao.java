package edu.kevinmohu.models.daos;

import edu.kevinmohu.models.entities.Alumno;

import java.util.List;

public interface AlumnoDao extends EntidadDao<Alumno,Integer>{

    public List<Alumno> findByNombre(String nombre);
    public List<Alumno> findByEstado(String nombre);


}
