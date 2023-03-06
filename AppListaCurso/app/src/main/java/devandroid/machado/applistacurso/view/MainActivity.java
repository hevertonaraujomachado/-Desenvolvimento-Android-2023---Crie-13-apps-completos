package devandroid.machado.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.machado.applistacurso.R;
import devandroid.machado.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


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

       /* dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa = "Sobre Nome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa = "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa = "Telefone Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa = "Sobre Nome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa = "Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa = "Telefone Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();*/

        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outraPessoa.toString());
    }
}