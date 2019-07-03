package com.example.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
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

        Champions1920.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChampionsLActivity.this, BotoesActivity.class);
                startActivity(intent);


            }
        });


    }
}
