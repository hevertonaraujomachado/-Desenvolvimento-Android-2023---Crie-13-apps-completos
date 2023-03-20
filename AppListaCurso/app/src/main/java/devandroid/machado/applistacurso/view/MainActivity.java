package devandroid.machado.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.machado.applistacurso.R;
import devandroid.machado.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa outraPessoa;

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

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Heverton");
        pessoa.setSobreNome("Machado");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("8999999999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("heveq");
        outraPessoa.setSobreNome("Machadoo");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("8999899999");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenomeAluno = findViewById(R.id.editSobrenomeAluno);
        editNomeDoCursoDesejad = findViewById(R.id.editNomeDoCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalisar = findViewById(R.id.btnFinalisar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenomeAluno.setText(pessoa.getSobreNome());
        editNomeDoCursoDesejad.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenomeAluno.setText("");
                editNomeDoCursoDesejad.setText("");
                editTelefoneContato.setText("");


            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnFinalisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenomeAluno.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCursoDesejad.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa, Toast.LENGTH_LONG).show();

            }
        });

        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outraPessoa.toString());

    }
}