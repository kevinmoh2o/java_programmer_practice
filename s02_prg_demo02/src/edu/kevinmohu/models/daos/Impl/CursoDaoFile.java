package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public class CursoDaoFile implements CursoDao {
    @Override
    public void create(Curso curso) {
        System.out.println("CursoDaoFile.create");
    }

    @Override
    public void update(Curso curso) {
        System.out.println("CursoDaoFile.update");
    }

    @Override
    public void delete(int id) {
        System.out.println("CursoDaoFile.delete");
    }

    @Override
    public Curso find(int id) {
        System.out.println("CursoDaoFile.find");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("CursoDaoFile.findAll");
        return null;
    }
}
