package edu.kevinmohu.beans;

import static edu.kevinmohu.util.Util.MAX;
import static edu.kevinmohu.util.Util.APROBADO;
import static edu.kevinmohu.util.Util.DESAPROBADO;

public class Alumno extends Persona {

    private double promedio;
    private String estado;

    public Alumno(){
        super();
        this.promedio=0.0;
        this.estado="Desaprobado";
    }

    public Alumno(String nombre, Boolean genero, double promedio) {
        super(nombre, genero);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado= (promedio>= MAX)?APROBADO:DESAPROBADO;
    }

}
