package devandroid.machado.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.machado.applistacurso.model.Pessoa;
import devandroid.machado.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref listavip";

    public PessoaController(MainActivity mainActivity) {
        preferences =
                mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();


    }


    @NonNull
    @Override
    public String toString() {
        return null;
    }


    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Controller iniciada..." + pessoa.toString());

        listaVip.putString("PrimeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("SobrenomeAluno", pessoa.getSobreNome());
        listaVip.putString("NomeDoCursoDesejado", pessoa.getCursoDesejado());
        listaVip.putString("TelefoneContato", pessoa.getTelefoneContato());
        listaVip.apply();


    }

    public Pessoa buscar(Pessoa pessoa) {

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));

        return pessoa;
    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();


    }
}
