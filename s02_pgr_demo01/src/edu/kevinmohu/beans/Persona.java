package edu.kevinmohu.beans;

import static edu.kevinmohu.util.Util.incrementCounter;

public class Persona {
    private int id;
    private String nombre;
    private Boolean genero;


    public Persona(){
        this.id = incrementCounter();
        this.nombre=null;
        this.genero=false;
    }

    public Persona( String nombre, Boolean genero){
        this.id = incrementCounter();
        this.nombre=nombre;
        this.genero=genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }
}
