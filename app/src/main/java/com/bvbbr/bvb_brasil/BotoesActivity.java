package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
            public void onClick (View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BolkYCDhw3l/"));

                startActivity(browserIntent);


            }
        });
        ColoniaxBvB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Be0xD4eFjG_/"));

                startActivity(browserIntent);
            }
        });

        UBerlinxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BpmhchgAQvU/"));

                startActivity(browserIntent);


            }
        });

        BvBxBayerL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bh1CKU6HsGg/"));

                startActivity(browserIntent);


            }
        });

        FrankfurtXBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BtX1nEUB5nY/"));

                startActivity(browserIntent);


            }
        });

        BvBxWBremen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BtgaP6IBaMM/"));

                startActivity(browserIntent);


            }
        });

        FreiburgxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BwgsrTSHnrD/"));

                startActivity(browserIntent);


            }
        });

        BvBxMonchengladbch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Brpx3auBfx0/"));

                startActivity(browserIntent);


            }
        });

        ScheissexBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BrHF3ZphrJL/"));

                startActivity(browserIntent);

            }
        });

        BvBxWolfsburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BvoSmuShyFM/"));

                startActivity(browserIntent);


            }
        });

        BayernxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bg_FkSKgYp_/"));

                startActivity(browserIntent);


            }
        });

        BvBxPaderborn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BhFn73CAFPc/"));

                startActivity(browserIntent);


            }
        });

        HertaBxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BvEK_nfhRoE/"));

                startActivity(browserIntent);


            }
        });

        BvBxFortunaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BxT4K6hHRW9/"));

                startActivity(browserIntent);


            }
        });

        MainsxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bqjvq-CBkRG/"));

                startActivity(browserIntent);


            }
        });

        BvBxLeipzig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bm8CvXinjAF/"));

                startActivity(browserIntent);


            }
        });

        HoffenheinxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BoBhApOBJpE/"));

                startActivity(browserIntent);


            }
        });
    }


    }