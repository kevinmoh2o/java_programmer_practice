package edu.kevinmohu.tests;

import edu.kevinmohu.models.entities.Alumno;
import edu.kevinmohu.services.AlumnoService;
import edu.kevinmohu.services.Impl.AlumnoServiceImpl;

public class Prueba03 {
    public static void main(String[] args) {
        //TODO: mostrar la lista de 4 alumnos

        Alumno alumno01 = new Alumno(100,"Kevin","A",17.5,23);
        Alumno alumno02 = new Alumno(200,"Andrea","A",14.5,18);
        Alumno alumno03 = new Alumno(300,"Pepe","A",13.5,21);
        Alumno alumno04 = new Alumno(400,"Karen","D",7.5,23);
        Alumno alumno05 = new Alumno(500,"Diana","A",19.5,24);
        Alumno alumno06 = new Alumno(100,"Geraldine","A",20.0,20);

        AlumnoService servicio = new AlumnoServiceImpl();
        servicio.grabar(alumno01);
        servicio.grabar(alumno02);
        servicio.grabar(alumno03);
        servicio.grabar(alumno04);
        servicio.grabar(alumno05);
        servicio.grabar(alumno06);
        servicio.listar().forEach(System.out::println);
    }
}
