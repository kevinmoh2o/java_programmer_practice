package edu.kevinmohu.services;

import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public interface CursoService {

    public void grabar(Curso curso);
    public void actualizar(Curso curso);
    public void borrar(int id);
    public List<Curso> listar();
    public Curso buscar(int id);
}
