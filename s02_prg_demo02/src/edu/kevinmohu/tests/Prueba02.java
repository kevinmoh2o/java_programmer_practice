package edu.kevinmohu.tests;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.daos.Impl.DaoFactory;
import edu.kevinmohu.models.entities.Curso;
import edu.kevinmohu.services.CursoService;
import edu.kevinmohu.services.Impl.CursoServiceImpl;

import static edu.kevinmohu.utils.Util.tipo;

public class Prueba02 {

    public static void main(String[] args) {
        Curso curso01 = new Curso(100,"Programmer",2);
        Curso curso02 = new Curso(200,"Developer",3);
        Curso curso03 = new Curso(100,"Expert",5);
        CursoService service = new CursoServiceImpl();
        service.grabar(curso01);
        service.grabar(curso02);
        service.grabar(curso03);
        //System.out.println(service.listar());


        //Las sigueintes 2 funciones son equivalentes
        service.listar().forEach(item->System.out.println(item));
        service.listar().forEach(System.out::println);
    }
}
