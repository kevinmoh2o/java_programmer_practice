package edu.kevinmohu.tests;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.daos.Impl.DaoFactory;
import edu.kevinmohu.models.entities.Curso;
import edu.kevinmohu.services.CursoService;
import edu.kevinmohu.services.Impl.CursoServiceImpl;

import static edu.kevinmohu.utils.Util.tipo;

public class Prueba02 {

    public static void main(String[] args) {
        Curso curso01 = new Curso(100,"JAva",5);
        CursoService service = new CursoServiceImpl();
        service.grabar(curso01);
    }
}
