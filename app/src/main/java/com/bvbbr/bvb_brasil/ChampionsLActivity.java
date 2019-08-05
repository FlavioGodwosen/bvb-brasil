package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChampionsLActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championsl);

        ImageView Champions = findViewById(R.id.imageView5);
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

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bt08qovHDCD/?utm_source=ig_web_copy_link"));

                startActivity(browserIntent);


            }
        });


    }
}
