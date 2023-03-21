package devandroid.machado.applistacurso.controller;

import android.util.Log;

import devandroid.machado.applistacurso.model.Pessoa;

public class PessoaController {
    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller","Controller iniciada..."+pessoa.toString());
    }
}
