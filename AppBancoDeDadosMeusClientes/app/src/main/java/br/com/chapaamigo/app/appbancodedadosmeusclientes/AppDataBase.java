package br.com.chapaamigo.app.appbancodedadosmeusclientes;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String DB_NAME = "MeusClientes.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;



    public AppDataBase(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String tabelaCliente = "CREATE TABLE cliente \n" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                " \tnome TEXT,\n" +
                " \tsalario REAL, \n" +
                " \tpreco NUMERIC,\n" +
                " \tidade INTEGER,\n" +
                " \tativo INTEGER,\n" +
                " \tdataCadastro TEXT,\n" +
                " \thoraCadastro TEXT\n" +
                " )";
        try {
            db.execSQL(tabelaCliente);
        }catch(SQLException e){
            Log.e("DB_LOG","onCreate: "+e.getLocalizedMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
