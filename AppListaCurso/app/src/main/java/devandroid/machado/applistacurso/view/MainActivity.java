package devandroid.machado.applistacurso.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import devandroid.machado.applistacurso.R;
import devandroid.machado.applistacurso.controller.PessoaController;
import devandroid.machado.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;
    Pessoa pessoa;


    EditText editPrimeiroNome;
    EditText editSobrenomeAluno;
    EditText editNomeDoCursoDesejad;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalisar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        controller = new PessoaController(MainActivity.this);
        controller.toString();

        pessoa = new Pessoa();
        controller.buscar(pessoa);


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeDoCursoDesejad = findViewById(R.id.editNomeDoCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCursoDesejad.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalisar = findViewById(R.id.btnFinalisar);

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