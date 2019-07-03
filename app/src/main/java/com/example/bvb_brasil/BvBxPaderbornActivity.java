package com.example.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class BvBxPaderbornActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvbxpaderborn);

        ScrollView TelaTexto = findViewById(R.id.ScrollView);
        ImageView mains = findViewById(R.id.imageView);
        TextView Texto = findViewById(R.id.textView3);

    }
}

