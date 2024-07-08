package edu.kevinmohu.beans;

public class Profesor extends Persona{

    private String categoria;
    private Long sueldo;

    public Profesor() {
    }


    public Profesor(String nombre, Boolean genero, String categoria) {
        super(nombre, genero);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getSueldo() {

        switch (categoria){
            case "A":
                sueldo = 3000L;
                break;
            case "B":
                sueldo = 2000L;
                break;
            case "C":
                sueldo = 1000L;
                break;
            default:
                break;
        }
        return sueldo;
    }


}
