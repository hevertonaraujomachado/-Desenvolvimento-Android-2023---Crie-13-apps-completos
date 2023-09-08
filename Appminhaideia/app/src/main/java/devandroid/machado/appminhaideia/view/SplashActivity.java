package devandroid.machado.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.logging.Handler;

import devandroid.machado.appminhaideia.R;
import devandroid.machado.appminhaideia.appminhaideiaDB.AppMinhaIdeiaDB;

public class SplashActivity extends AppCompatActivity {

    public class SplashActivity extends AppCompatActivity {
        public static final int TIME_OUT_SPLASH = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(devandroid.machado.appminhaideia.R.layout.activity_splash);

            cumutarTelaSplash();
        }

        private void cumutarTelaSplash() {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                     appminhaideia db = new AppMinhaIdeiaDB(SplashActivity.this);


                    Intent telaPrincipal = new Intent(SplashActivity.this,
                            AppMinhaIdeiaActivity.class);
                    startActivity(telaPrincipal);
                    finish();
                }
            }, TIME_OUT_SPLASH);
        }
    }