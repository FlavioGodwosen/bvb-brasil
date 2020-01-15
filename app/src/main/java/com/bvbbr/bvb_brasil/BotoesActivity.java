package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.bvbbr.bvb_brasil.R.id.text;


public class BotoesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botoes);

        TextView Jogos = findViewById(text);
        ScrollView TelaButton = findViewById(R.id.ScrollView);
        final Button BvBxAugsburg = findViewById(R.id.button);
        final Button ColoniaxBvB = findViewById(R.id.button2);
        final Button UBerlinxBvB = findViewById(R.id.button3);
        final Button BvBxBayerL =  findViewById(R.id.button4);
        final Button FrankfurtXBvB = findViewById(R.id.button5);
        final Button BvBxWBremen = findViewById(R.id.button6);
        final Button FreiburgxBvB = findViewById(R.id.button7);
        final Button BvBxMonchengladbch = findViewById(R.id.button8);
        final Button ScheissexBvB = findViewById(R.id.button9);
        final Button BvBxWolfsburg = findViewById(R.id.button10);
        final Button BayernxBvB = findViewById(R.id.button11);
        final Button BvBxPaderborn = findViewById(R.id.button12);
        final Button HertaBxBvB = findViewById(R.id.button13);
        final Button BvBxFortunaD = findViewById(R.id.button14);
        final Button MainsxBvB = findViewById(R.id.button15);
        final Button BvBxLeipzig = findViewById(R.id.button16);
        final Button HoffenheinxBvB = findViewById(R.id.button17);
        final Button AugsburgxBvB = findViewById(R.id.button18);
        final Button BvBxColonia = findViewById(R.id.button19);
        final Button BvBxUnion_B = findViewById(R.id.button20);
        final Button BayerLxBvB = findViewById(R.id.button21);
        final Button BvBxFrankfurt = findViewById(R.id.button22);
        final Button WBremenxBvB = findViewById(R.id.button23);
        final Button BvBxFreiburg = findViewById(R.id.button24);
        final Button MonchengladbchxBvB = findViewById(R.id.button25);
        final Button BvBxScheisse = findViewById(R.id.button26);
        final Button WolfsburgxBvB = findViewById(R.id.button27);
        final Button BvBxBayern = findViewById(R.id.button28);
        final Button PaderbornxBvB = findViewById(R.id.button29);
        final Button BvBxHertaB = findViewById(R.id.button30);
        final Button FortunaDxBvB = findViewById(R.id.button31);
        final Button BvBxMains = findViewById(R.id.button32);
        final Button LeipzigxBvB = findViewById(R.id.button33);
        final Button BvBxHoffenhein = findViewById(R.id.button34);

        BvBxAugsburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1Q79vqhQ92/"));

                startActivity(browserIntent);


            }
        });
        ColoniaxBvB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1g3FMjBz89/"));

                startActivity(browserIntent);
            }
        });

        UBerlinxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1zysSlBiuC/"));

                startActivity(browserIntent);


            }
        });

        BvBxBayerL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B2Yd1YZhpA1/"));

                startActivity(browserIntent);


            }
        });

        FrankfurtXBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B2twsYRhaF3/"));

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


        AugsburgxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1Q79vqhQ92/"));

                startActivity(browserIntent);


            }
        });
        BvBxColonia.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1g3FMjBz89/"));

                startActivity(browserIntent);
            }
        });

        BvBxUnion_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1zysSlBiuC/"));

                startActivity(browserIntent);


            }
        });

        BayerLxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B2Yd1YZhpA1/"));

                startActivity(browserIntent);


            }
        });

        BvBxFrankfurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B2twsYRhaF3/"));

                startActivity(browserIntent);


            }
        });

        WBremenxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BtgaP6IBaMM/"));

                startActivity(browserIntent);


            }
        });

        BvBxFreiburg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BwgsrTSHnrD/"));

                startActivity(browserIntent);


            }
        });

        MonchengladbchxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Brpx3auBfx0/"));

                startActivity(browserIntent);


            }
        });

        BvBxScheisse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BrHF3ZphrJL/"));

                startActivity(browserIntent);

            }
        });

        WolfsburgxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BvoSmuShyFM/"));

                startActivity(browserIntent);


            }
        });

        BvBxBayern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bg_FkSKgYp_/"));

                startActivity(browserIntent);


            }
        });

        PaderbornxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BhFn73CAFPc/"));

                startActivity(browserIntent);


            }
        });

        BvBxHertaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BvEK_nfhRoE/"));

                startActivity(browserIntent);


            }
        });

        FortunaDxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BxT4K6hHRW9/"));

                startActivity(browserIntent);


            }
        });

        BvBxMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bqjvq-CBkRG/"));

                startActivity(browserIntent);


            }
        });

        LeipzigxBvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/Bm8CvXinjAF/"));

                startActivity(browserIntent);


            }
        });

        BvBxHoffenhein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/BoBhApOBJpE/"));

                startActivity(browserIntent);


            }
        });
    }
}

