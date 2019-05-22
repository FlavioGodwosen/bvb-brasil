package com.example.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityPrincipal extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            final EditText email = findViewById(R.id.txtEmail);
            final EditText senha = findViewById(R.id.txtPassword);
            Button entrar = findViewById(R.id.btnLogin);

            entrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String emailString = email.getText().toString();
                    String senhaString = senha.getText().toString();

                    if (emailString.isEmpty() || senhaString.isEmpty()) {
                        Toast.makeText(ActivityPrincipal.this, "email ou senha vazios", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ActivityPrincipal.this, "Heja BvB", Toast.LENGTH_SHORT).show();

                        Bundle pacote = new Bundle();
                        pacote.putString("pacote_email", emailString);

                        Intent intencao = new Intent(ActivityPrincipal.this, MainActivity.class);
                        intencao.putExtras(pacote);

                        startActivity(intencao);


                    }

                }
            });

        }

}



