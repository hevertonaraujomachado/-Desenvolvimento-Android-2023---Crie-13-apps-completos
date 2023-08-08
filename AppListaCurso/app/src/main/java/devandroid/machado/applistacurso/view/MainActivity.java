package devandroid.machado.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import devandroid.machado.applistacurso.R;
import devandroid.machado.applistacurso.controller.CursoController;
import devandroid.machado.applistacurso.controller.PessoaController;
import devandroid.machado.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;
    CursoController cursoController;
    Pessoa pessoa;
    List<String> nomesDoCursos;


    EditText editPrimeiroNome;
    EditText editSobrenomeAluno;
    EditText editNomeDoCursoDesejad;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalisar;

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        controller = new PessoaController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController();
        nomesDoCursos = cursoController.dadosParaSpinner();


        pessoa = new Pessoa();
        controller.buscar(pessoa);


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeDoCursoDesejad = findViewById(R.id.editNomeDoCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        spinner = findViewById(R.id.spinner);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCursoDesejad.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalisar = findViewById(R.id.btnFinalisar);

         // adaper
        //Layout
        // injetar o adapter ao Spinner - A lista gera gerada

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);




        btnLimpar.setOnClickListener(view -> {
            editPrimeiroNome.setText("");
            editSobrenomeAluno.setText("");
            editNomeDoCursoDesejad.setText("");
            editTelefoneContato.setText("");

            controller.limpar();

        });

        btnSalvar.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();


            controller.salvar(pessoa);

        });
        btnFinalisar.setOnClickListener(view -> {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
            pessoa.setCursoDesejado(editNomeDoCursoDesejad.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

            Toast.makeText(MainActivity.this, "Salvo" + pessoa, Toast.LENGTH_LONG).show();

        });

        btnSalvar.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
            finish();
        });

        btnFinalisar.setOnClickListener(view -> {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
            pessoa.setCursoDesejado(editNomeDoCursoDesejad.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());


            Toast.makeText(MainActivity.this, "Salvo" + pessoa, Toast.LENGTH_LONG).show();

        });

        Log.i("POOAndroid", pessoa.toString());


    }
}