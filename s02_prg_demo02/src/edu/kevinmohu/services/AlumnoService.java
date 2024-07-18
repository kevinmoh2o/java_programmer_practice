package edu.kevinmohu.services;

import edu.kevinmohu.models.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    public void grabar(Alumno curso);
    public void actualizar(Alumno curso);
    public void borrar(int id);
    public List<Alumno> listar();
    public Alumno buscar(int id);
}
