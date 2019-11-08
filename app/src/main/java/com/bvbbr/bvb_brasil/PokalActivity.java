package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PokalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokal);

        ImageView Reus = findViewById(R.id.imageView7);
        Button Pokal = findViewById(R.id.button20);
        Button Analise = findViewById(R.id.button21);

        Pokal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dfb.de/dfb-pokal/spieltag/?no_cache=1"));

                startActivity(browserIntent);


            }
        });

        Analise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B0841WbBplI/"));

                startActivity(browserIntent);


            }
        });
    }
}