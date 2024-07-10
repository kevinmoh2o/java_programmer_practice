package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.entities.Curso;

import java.util.List;

public class CursoDaoDataBase implements CursoDao {
    @Override
    public void create(Curso curso) {
        System.out.println("CursoDaoDataBase.create");
    }

    @Override
    public void update(Curso curso) {
        System.out.println("CursoDaoDataBase.update");
    }

    @Override
    public void delete(int id) {
        System.out.println("CursoDaoDataBase.delete");
    }

    @Override
    public Curso find(int id) {
        System.out.println("CursoDaoDataBase.find");
        return null;
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("CursoDaoDataBase.findAll");
        return null;
    }
}
