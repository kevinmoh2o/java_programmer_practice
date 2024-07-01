package edu.kevinmohu.beans;

public class Persona {
    private int id;
    private String nombre;
    private Boolean genero;


    public Persona(){
        this.nombre=null;
        this.genero=false;
    }

    public Persona( String nombre, Boolean genero){
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
