package devandroid.machado.appgaseta.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.machado.appgaseta.R;
import devandroid.machado.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    EditText editGasolina;
    EditText editEtanol;

    TextView txtResultado;

    Button btnCalcular;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalisar;

    double precoGasolina;
    double precoEtanol;
    String recomendacao;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta);

        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);

        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalisar = findViewById(R.id.btnFinalisar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOk = true;

                if (TextUtils.isEmpty(editGasolina.getText())) {
                    editGasolina.setError("*Obrigatorio");
                    editGasolina.requestFocus();
                    isDadosOk = false;
                }


                if (TextUtils.isEmpty(editEtanol.getText())) {
                    editEtanol.setError("*Obrigatorio");
                    editEtanol.requestFocus();
                    isDadosOk = false;

                }
                if (isDadosOk) {

                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());
                    recomendacao = UtilGasEta.calculadorarMelhorOpcao(precoGasolina, precoEtanol);
                    txtResultado.setText(recomendacao);

                } else {
                    Toast.makeText(GasEtaActivity.this, "Por favor, Digita os Dados Corretamente ...", Toast.LENGTH_LONG).show();


                }

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editEtanol.setText("");
                editGasolina.setText("");

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnFinalisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GasEtaActivity.this, "GasEta Boa Economia ...", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        Toast.makeText(GasEtaActivity.this, UtilGasEta.calculadorarMelhorOpcao(5.79, 4.14), Toast.LENGTH_LONG).show();

    }

}
