package devandroid.machado.appgaseta.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;

import java.util.List;

import devandroid.machado.appgaseta.database.GasEtaDB;
import devandroid.machado.appgaseta.model.Combustivel;
import devandroid.machado.appgaseta.view.GasEtaActivity;

public class CombustivelController extends GasEtaDB {

    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreferences;

    //psfs

    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(GasEtaActivity activity) {
        super(activity);

        preferences =
                activity.getSharedPreferences(NOME_PREFERENCES, 0);

        dadosPreferences = preferences.edit();
    }


    public void salvar(Combustivel combustivel) {

        ContentValues dados = new ContentValues();

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDocombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getNomeDoCombustivel());
        dadosPreferences.apply();

        dados.put("nomeDoCombustivel", combustivel.getNomeDoCombustivel());
        dados.put("precoDoCombustivel", combustivel.getPrecoDoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        salvarObjeto("Copmbustivel", dados);
    }

    public List<Combustivel> getListaDados() {
        return listarDados();
    }

    public void alterar(Combustivel combustivel) {

        ContentValues dados = new ContentValues();
        dados.put("id", combustivel.getId());
        dados.put("nomeDoCombustivel", combustivel.getNomeDoCombustivel());
        dados.put("precoDoCombustivel", combustivel.getPrecoDoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        alterarObjeto("Combustivel" ,dados);


    }


    public void limpar() {

        dadosPreferences.clear();
        dadosPreferences.apply();
    }
}
