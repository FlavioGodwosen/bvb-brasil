package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class ActivityPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        HorizontalScrollView Banners = findViewById(R.id.ScrollView1);
        final ImageView Banners1 = findViewById(R.id.bgImage4);
        final ImageView Banners2 = findViewById(R.id.bgImage1);
        //final ImageView Banners3 = findViewById(R.id.bgImage2);
        //ImageView.setMovementMethod(new ScrollingMovementMethod());


        Button Bundesliga = (Button) findViewById(R.id.Bundeslig);
        Button SuperCopa = (Button) findViewById(R.id.SuperCopa);
        Button Pokal = (Button) findViewById(R.id.Pokal);
        Button ChampionsL = (Button) findViewById(R.id.ChampionsL);
        Button Encontros = (Button) findViewById(R.id.Encontros);

        Bundesliga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, BotoesActivity.class);
                startActivity(intent);


            }
        });

        ChampionsL.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, ChampionsLActivity.class);
                startActivity(intent);


            }
        });

        SuperCopa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, JogoSuperCupActivity.class);
                startActivity(intent);


            }
        });

        Pokal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, PokalActivity.class);
                startActivity(intent);


            }
        });

        Encontros.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityPrincipal.this, EncontroActivity.class);
                startActivity(intent);


            }
        });

    }
}


