package edu.kevinmohu.pruebas;

import edu.kevinmohu.beans.Alumno;
import edu.kevinmohu.beans.Persona;

public class Prueba03 {

    public static void main(String[] args){
        Alumno p1 = new Alumno("Juan",true,18.0);
        System.out.println(p1.getId());
        System.out.println(p1.getNombre());
        System.out.println(p1.getGenero());
        System.out.println(p1.getPromedio());
        System.out.println(p1.getEstado());
    }
}
