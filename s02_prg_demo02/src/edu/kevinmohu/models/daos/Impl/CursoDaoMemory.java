package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public class CursoDaoMemory implements CursoDao {
    @Override
    public void create(Curso curso) {
        System.out.println("CursoDaoMemory.create");
    }

    @Override
    public void update(Curso curso) {
        System.out.println("CursoDaoMemory.update");
    }

    @Override
    public void delete(int id) {
        System.out.println("CursoDaoMemory.delete");
    }

    @Override
    public Curso find(int id) {
        System.out.println("CursoDaoMemory.find");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("CursoDaoMemory.findAll");
        return null;
    }
}
