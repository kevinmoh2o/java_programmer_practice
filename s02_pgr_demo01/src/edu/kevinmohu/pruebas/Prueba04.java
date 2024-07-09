package edu.kevinmohu.pruebas;

import edu.kevinmohu.beans.Profesor;

public class Prueba04 {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Gerardo",true,"A");
        System.out.println(p1.getCategoria());
        System.out.println(p1.getSueldo());
        System.out.println(p1.getId());
        System.out.println(p1.getGenero());
        System.out.println(p1.getNombre());
        System.out.println(p1.getClass());
    }
}
