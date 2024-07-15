package edu.kevinmohu.models.daos;

import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public interface EntidadDao<T,V>{

    public void create(T curso);
    public void update(T curso);
    public void delete(V id);
    public Curso find(V id);
    public List<T> findAll();
}
