package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class EncontroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontro);

        Button Facebook = findViewById(R.id.button1);
        Button Endereco = findViewById(R.id.button2);
        Button Cadastro = findViewById(R.id.button19);
        Button Twitter = findViewById(R.id.button20);
        Button Instagram = findViewById(R.id.button21);
        WebView myWebView = findViewById(R.id.webview);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        myWebView.setWebViewClient(webViewClient);

        myWebView.loadUrl("https://www.facebook.com/BVBBR09/photos/a.990778157670107/1930271350387445/?type=3&theater");

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);


        Facebook.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/dortmundbrasil/"));

                startActivity(browserIntent);


            }
        });

        Endereco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/O'Malley's/@-23.558204,-46.6660399,15z/data=!4m5!3m4!1s0x0:0x5c53c5929142242!8m2!3d-23.558204!4d-46.6660399"));

                startActivity(browserIntent);


            }
        });

        Cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd24_xF9EbAzgC1FlCR9kqMaa6fGYArYq5vHzpRj2frCAndEw/viewform"));

                startActivity(browserIntent);


            }

        });

        Twitter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/bdortmundbr09"));

                startActivity(browserIntent);


            }

        });

        Instagram.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/_bvb09brasil/"));

                startActivity(browserIntent);


            }

        });
    }
}