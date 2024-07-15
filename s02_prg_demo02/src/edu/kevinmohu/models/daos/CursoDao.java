package edu.kevinmohu.models.daos;

import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public interface CursoDao extends EntidadDao<Curso,Integer> {

    public List<Curso> findByRangeCreditos(Integer monimo,Integer maximo);
}
