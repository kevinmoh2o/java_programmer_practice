package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.AlumnoDao;
import edu.kevinmohu.models.entities.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDaoMemory implements AlumnoDao {


    private List<Alumno> alumnos;

    public AlumnoDaoMemory(){
        alumnos = new ArrayList<>();
    }

    @Override
    public List<Alumno> findByNombre(String nombre) {
        return null;
    }

    @Override
    public List<Alumno> findByEstado(String nombre) {
        return null;
    }

    @Override
    public void create(Alumno alumno) {
        if(find(alumno.id())==null && alumno != null){
            alumnos.add(alumno);
        }
    }

    @Override
    public void update(Alumno alumno) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Alumno find(Integer id) {
        return alumnos.stream()
                .filter(item->id == item.id())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Alumno> findAll() {
        return this.alumnos;
    }
}
