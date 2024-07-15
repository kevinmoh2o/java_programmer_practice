package edu.kevinmohu.models.daos.Impl;

import edu.kevinmohu.models.daos.AlumnoDao;
import edu.kevinmohu.models.daos.CursoDao;
import edu.kevinmohu.utils.Tipo;

public class DaoFactory {

    public static final DaoFactory INSTANCE = new DaoFactory();
    private static DaoFactory instance;

    public static DaoFactory getInstance(){
        return INSTANCE;
    }

    private DaoFactory(){

    }

    public CursoDao getCursoDao(Tipo tipo){
        switch (tipo){
            case DB:
                return new CursoDaoDataBase();
            case FILE:
                return new CursoDaoFile();
            case MEMORY:
                return new CursoDaoMemory();
            case XML:
                return new CursoDaoXml();
            default:
                return null;
        }
    }

    public AlumnoDao getAlumnoDao(Tipo tipo){
        switch (tipo){
            case DB:
                return new AlumnoDaoDataBase();
            case FILE:
                return new AlumnoDaoFile();
            case MEMORY:
                return new AlumnoDaoMemory();
            case XML:
                return new AlumnoDaoXml();
            default:
                return null;
        }
    }
}
