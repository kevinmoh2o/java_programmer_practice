package edu.kevinmohu.models.daos;

import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public interface EntidadDao<T,V>{

    public void create(T entidad);
    public void update(T entidad);
    public void delete(V id);
    public T find(V id);
    public List<T> findAll();
}
