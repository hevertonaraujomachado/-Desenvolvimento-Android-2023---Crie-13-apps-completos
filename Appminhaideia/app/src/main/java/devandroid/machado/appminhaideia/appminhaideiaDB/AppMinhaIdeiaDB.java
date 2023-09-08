package devandroid.machado.appminhaideia.appminhaideiaDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import devandroid.machado.appminhaideia.model.Cliente;
import devandroid.machado.appminhaideia.model.Produto;

public class AppMinhaIdeiaDB extends SQLiteOpenHelper {



        private static final String DB_NAME = "appminhaideia.db";
        private static final int DB_VERSION = 1;

        Produto produto;
        SQLiteDatabase db;


        public AppMinhaIdeiaDB(Context context) {
            super(context, DB_NAME, null, DB_VERSION);

            db = getWritableDatabase();
        }

        @Override
        public void onCreate(SQLiteDatabase db) {


            String sqlTabelaVeiculo
                    = "CREATE TABLE Veiculo (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nomeDoCarro TEXT, " +
                    "placaDoCarro TEXT)";

            String sqlTabelaCombustivel
                    = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nomeDoCombustivel TEXT, " +
                    "precoDoCombustivel REAL, " +
                    "recomendacao TEXT)";


            db.execSQL(sqlTabelaCombustivel);
            db.execSQL(sqlTabelaVeiculo);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

        public void salvarObjeto(String tabela, ContentValues dados) {

            db.insert(tabela, null, dados);

        }


}
