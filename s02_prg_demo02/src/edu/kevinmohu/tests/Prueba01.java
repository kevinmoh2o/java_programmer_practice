package edu.kevinmohu.tests;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.daos.Impl.DaoFactory;
import edu.kevinmohu.models.entities.Curso;
import static  edu.kevinmohu.utils.Util.tipo;

public class Prueba01 {

    public static void main(String[] args) {
        Curso curso01 = new Curso(100,"JAva",5);
        //CursoDao dao = DaoFactory.INSTANCE.getCursoDao(tipo);
        CursoDao dao = DaoFactory.getInstance().getCursoDao(tipo);
        dao.create(curso01);
        //System.out.println(curso01);
        //TODO: mostrar la lsita de 4 alumnos en memoria usando Service y Dao
    }

}
