package devandroid.machado.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.machado.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("Kotlin"));
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("React Native"));
        listCursos.add(new Curso("Jave EEE"));
        listCursos.add(new Curso("Frotend"));
        listCursos.add(new Curso("Backend"));

        return listCursos;
    }
public ArrayList<String> dadosParaSpinner(){

    ArrayList<String> dados = new ArrayList<>();

    for (int i = 0; i < getListCursos().size();i++ ){

        Curso objeto =(Curso) getListCursos().get(i);
        dados.add(objeto.getNomeDoCursoDesejado());

    }

return dados;

}



}
