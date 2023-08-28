package devandroid.machado.appgaseta.controller;

import android.content.SharedPreferences;

import devandroid.machado.appgaseta.model.Combustivel;
import devandroid.machado.appgaseta.view.GasEtaActivity;

public class CombustivelController {

    SharedPreferences preferences;
    SharedPreferences.Editor dadospreferences;

    //psfs

    public static final String NOME_PREFERENCES = "pref_gaseta";

    public void PessoaController(GasEtaActivity activity) {

        preferences =
                activity.getSharedPreferences(NOME_PREFERENCES, 0);
        dadospreferences = preferences.edit();
    }

    public CombustivelController(GasEtaActivity activity) {

    }

    public void salvar(Combustivel combustivel){

        dadospreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadospreferences.putFloat("precoDocombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadospreferences.putString("recomendacao",  combustivel.getNomeDoCombustivel());
        dadospreferences.apply();
    }

    public void  limpar(){

        dadospreferences.clear();
        dadospreferences.apply();
    }
}
