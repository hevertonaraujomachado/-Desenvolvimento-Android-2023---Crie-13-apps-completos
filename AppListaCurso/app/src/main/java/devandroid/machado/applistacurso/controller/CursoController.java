package devandroid.machado.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.machado.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;

    public List getListCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());

        return listCursos;
    }
}
