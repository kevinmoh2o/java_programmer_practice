package edu.kevinmohu.pruebas;

import edu.kevinmohu.beans.Persona;

public class Prueba01 {

    public static void main(String[] args){
        Persona p1 = new Persona("Kevin",true);
        System.out.println(p1.getId());
        System.out.println(p1.getNombre());
        System.out.println(p1.getGenero());

        Persona p2= new Persona("Pablex",true);
        System.out.println(p2.getId());
        System.out.println(p2.getNombre());
        System.out.println(p2.getGenero());
    }


}
