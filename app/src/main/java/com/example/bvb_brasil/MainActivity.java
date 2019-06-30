package com.example.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;



public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TextView Jogos = findViewById(R.id.text);
        ScrollView TelaButton = findViewById(R.id.ScrollView);
        final Button BvBxMains = findViewById(R.id.button);
        //final Button WBremenxBvB = findViewById(R.id.button2);
        //final Button KolnxBvB = findViewById(R.id.button3);

        BvBxMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(MainActivity.this, BvBxMainsActivity.class);

                startActivity(intencao);


            }
        });
    }


    }