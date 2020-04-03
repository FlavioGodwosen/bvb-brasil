package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EncontroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontro);

        Button Facebook = findViewById(R.id.button1);
        Button Endereco = findViewById(R.id.button2);
        Button Cadastro = findViewById(R.id.button19);
        Button Twitter = findViewById(R.id.button20);
        Button Instagram = findViewById(R.id.button21);
        Button Youtube = findViewById(R.id.button22);




        Endereco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(EncontroActivity.this, EnderecoBvbBr.class);

                startActivity(Intent);


            }
        });

        Cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(EncontroActivity.this, CadastroBvbBr.class);

                startActivity(Intent);


            }

        });

        Twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EncontroActivity.this, TwitterBvbBr.class);
                startActivity(intent);


            }
        });

        Instagram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(EncontroActivity.this, InstagramBvbBr.class);

                startActivity(Intent);


            }

        });

        Youtube.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(EncontroActivity.this, YoutubeBvbBr.class);

                startActivity(Intent);


            }
        });


        Facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Intent = new Intent(EncontroActivity.this, FacebookBvbBr.class);

                startActivity(Intent);


            }
        });



    }
}