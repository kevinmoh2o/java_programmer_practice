package edu.kevinmohu.models.daos;

import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public interface CursoDao {

    public void create(Curso curso);
    public void update(Curso curso);
    public void delete(int id);
    public Curso find(int id);
    public List<Curso> findAll();
}
