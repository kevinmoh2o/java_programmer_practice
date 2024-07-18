package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.models.entities.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CursoDaoMemory implements CursoDao {

    private List<Curso> cursos;

    public CursoDaoMemory(){
        this.cursos = new ArrayList<>();
    }

    @Override
    public List<Curso> findByRangeCreditos(Integer monimo, Integer maximo) {
        List<Curso> subList = new ArrayList<>();
        for (Curso item:cursos){
            if(item.creditos()>=monimo && item.creditos()<=maximo){
                subList.add(item);
            }
        }
        return subList;
    }



    @Override
    public void create(Curso curso) {
        System.out.println("CursoDaoMemory.create");
        if(find(curso.id())==null && curso!=null){
            cursos.add(curso);
        }

    }

    @Override
    public void update(Curso curso) {
        System.out.println("CursoDaoMemory.update");
        for (int i=0;i < cursos.size();i++){
            if(cursos.get(i).id() == curso.id()){
                cursos.set(i,curso);
            }
        }
    }

    @Override
    public void delete(Integer id) {
        System.out.println("CursoDaoMemory.delete");

        /*
        Ambos algoritmos funcionan, este de aqui en con bucles FOR y el otro ocn stream
        como bien sabemos los stream pasan los datos por valor y los FOR por referencia
        for(Curso curso:cursos){
            if(curso.id()== id){
                cursos.remove(curso);
            }
        }*/
        cursos.stream().
                filter(item-> !(item.id()==id) )
                .collect(Collectors.toList());
    }

    @Override
    public Curso find(Integer id) {
        System.out.println("CursoDaoMemory.find");
        return cursos.stream()
                .filter(item -> id.equals(item.id()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Curso> findAll() {
        System.out.println("CursoDaoMemory.findAll");
        return cursos;
    }
}
