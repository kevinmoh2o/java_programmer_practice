package edu.kevinmohu.util;

public class Util {
    public int  a=5;//variable de instancia

    public static int b=10;// variable de clase
    public static int i=1;
    public static final double MAX = 13;
    public static final String APROBADO = "Aprobado";
    public static final String DESAPROBADO = "YaChingo";

    public static int generarId(){
        return (int) (Math.random()*1000);
    }

    public static int incrementCounter(){
        return i++;
    }
    public int sumar(int a, int b){
        return a+b;
    }
}
