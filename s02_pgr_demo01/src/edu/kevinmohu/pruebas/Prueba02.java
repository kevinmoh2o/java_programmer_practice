package edu.kevinmohu.pruebas;

import edu.kevinmohu.beans.Persona;
import edu.kevinmohu.util.Util;

public class Prueba02 {

    public static void main(String[] args){
        int x = Util.b;//Variable de clase
        System.out.println(x);

        int y = new Util().a;//Variable de instancia
        System.out.println(y);

        int z = Util.generarId();//Variable de instancia
        System.out.println(z);

        int i = Util.incrementCounter();//Variable de instancia
        System.out.println(i);
        i = Util.incrementCounter();//Variable de instancia
        i = Util.incrementCounter();//Variable de instancia
        System.out.println(i);
        


    }
}
