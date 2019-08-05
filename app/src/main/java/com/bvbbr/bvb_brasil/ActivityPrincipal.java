package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPrincipal extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button Bundesliga = (Button) findViewById(R.id.Bundeslig);
        Button SuperCopa = (Button) findViewById(R.id.SuperCopa);
        Button Pokal = (Button) findViewById(R.id.Pokal);
        Button ChampionsL = (Button) findViewById(R.id.ChampionsL);
        Button Encontros = (Button) findViewById(R.id.Encontros);

        Bundesliga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, SplashBundesligaActivity.class);
                startActivity(intent);


            }
        });

        ChampionsL.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, SplashChampionsActivity.class);
                startActivity(intent);


            }
        });

        SuperCopa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, SplashSupercupActivity.class);
                startActivity(intent);


            }
        });

        Pokal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, SplashPokalActivity.class);
                startActivity(intent);


            }
        });

        Encontros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, SplashEncontroActivity.class);
                startActivity(intent);


            }
        });

    }
}


