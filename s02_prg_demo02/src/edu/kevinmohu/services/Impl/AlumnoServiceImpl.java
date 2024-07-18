package edu.kevinmohu.services.Impl;

import edu.kevinmohu.models.daos.AlumnoDao;
import edu.kevinmohu.models.daos.Impl.DaoFactory;
import edu.kevinmohu.models.entities.Alumno;
import edu.kevinmohu.services.AlumnoService;

import java.util.List;

import static edu.kevinmohu.utils.Util.tipo;

public class AlumnoServiceImpl implements AlumnoService {

    private AlumnoDao dao;

    public AlumnoServiceImpl(){
        this.dao = DaoFactory.getInstance().getAlumnoDao(tipo);
    }
    @Override
    public void grabar(Alumno curso) {
        dao.create(curso);
    }

    @Override
    public void actualizar(Alumno curso) {

    }

    @Override
    public void borrar(int id) {

    }

    @Override
    public List<Alumno> listar() {
        return dao.findAll();
    }

    @Override
    public Alumno buscar(int id) {
        return null;
    }
}
