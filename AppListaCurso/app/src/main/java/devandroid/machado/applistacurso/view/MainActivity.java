package devandroid.machado.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.machado.applistacurso.R;
import devandroid.machado.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

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





        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outraPessoa.toString());


    }
}