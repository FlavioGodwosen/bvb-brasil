package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ChampionsLActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championsl);


        Button Champions1920 = findViewById(R.id.button18);
        Button Analise = findViewById(R.id.button19);

        Champions1920.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.uefa.com/uefachampionsleague/season=2020/clubs/club=52758/"));

                startActivity(browserIntent);


            }
        });

        Analise.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1xT4PQhj2I/"));

                startActivity(browserIntent);


            }
        });


    }
}
