package com.example.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;



public class BotoesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botoes);

        TextView Jogos = findViewById(R.id.text);
        ScrollView TelaButton = findViewById(R.id.ScrollView);
        final Button BvBxAugsburg = (Button) findViewById(R.id.button);
        final Button ColoniaxBvB = (Button) findViewById(R.id.button2);
        final Button UBerlinxBvB = (Button) findViewById(R.id.button3);
        final Button BvBxBayerL = (Button) findViewById(R.id.button4);
        final Button FrankfurtXBvB = (Button) findViewById(R.id.button5);
        final Button BvBxWBremen = (Button) findViewById(R.id.button6);
        final Button FreiburgxBvB = (Button) findViewById(R.id.button7);
        final Button BvBxMonchengladbch = (Button) findViewById(R.id.button8);
        final Button ScheissexBvB = (Button) findViewById(R.id.button9);
        final Button BvBxWolfsburg = (Button) findViewById(R.id.button10);
        final Button BayernxBvB = (Button) findViewById(R.id.button11);
        final Button BvBxPaderborn = (Button) findViewById(R.id.button12);
        final Button HertaBxBvB = (Button) findViewById(R.id.button13);
        final Button BvBxFortunaD = (Button) findViewById(R.id.button14);
        final Button MainsxBvB = (Button) findViewById(R.id.button15);
        final Button BvBxLeipzig = (Button) findViewById(R.id.button16);
        final Button HoffenheinxBvB = (Button) findViewById(R.id.button17);

        BvBxAugsburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxAugsburgActivity.class);

                startActivity(intencao);


            }
        });
        ColoniaxBvB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, ColoniaxBvBActivity.class);

                startActivity(intencao);
            }
        });

        UBerlinxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BerlinxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxBayerL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxBayerLActivity.class);

                startActivity(intencao);


            }
        });

        FrankfurtXBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, FrankfurtxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxWBremen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxWBremenActivity.class);

                startActivity(intencao);


            }
        });

        FreiburgxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, FreiburgxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxMonchengladbch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxMonchengladbachActivity.class);

                startActivity(intencao);


            }
        });

        ScheissexBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, ScheissexBvBActivity.class);

                startActivity(intencao);

            }
        });

        BvBxWolfsburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxWolfsburgActivity.class);

                startActivity(intencao);


            }
        });

        BayernxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BayernxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxPaderborn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxPaderbornActivity.class);

                startActivity(intencao);


            }
        });

        HertaBxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, HertaxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxFortunaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxFortunaDActivity.class);

                startActivity(intencao);


            }
        });

        MainsxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, MainsxBvBActivity.class);

                startActivity(intencao);


            }
        });

        BvBxLeipzig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, BvBxLeipzigActivity.class);

                startActivity(intencao);


            }
        });

        HoffenheinxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(BotoesActivity.this, HofeinheinxBvBActivity.class);

                startActivity(intencao);


            }
        });
    }


    }