package edu.kevinmohu.services.Impl;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.daos.Impl.DaoFactory;
import edu.kevinmohu.models.entities.Curso;
import edu.kevinmohu.services.CursoService;
import static edu.kevinmohu.utils.Util.tipo;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    private CursoDao dao;

    public CursoServiceImpl(){
        this.dao = DaoFactory.getInstance().getCursoDao(tipo);
    }

    @Override
    public void grabar(Curso curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Curso curso) {
        dao.update(curso);
    }

    @Override
    public void borrar(int id) {
        dao.delete(id);
    }

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }

    @Override
    public Curso buscar(int id) {
        return dao.find(id);
    }
}
