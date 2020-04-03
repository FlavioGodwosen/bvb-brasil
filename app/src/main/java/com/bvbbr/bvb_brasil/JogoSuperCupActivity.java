package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class JogoSuperCupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jogosupercup);


        Button Analise = findViewById(R.id.button22);
        Button Site = findViewById(R.id.button23);

        Analise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B06m9MIBCYH/"));

                startActivity(browserIntent);


            }
        });

        Site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.resultados.com/futebol/alemanha/supercopa/"));

                startActivity(browserIntent);


            }
        });



    }
}
