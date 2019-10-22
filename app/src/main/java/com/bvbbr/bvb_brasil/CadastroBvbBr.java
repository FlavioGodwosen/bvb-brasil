package com.bvbbr.bvb_brasil;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CadastroBvbBr extends Activity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_bvbbr);

        WebView cadastro = findViewById(R.id.webview4);
        cadastro.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd24_xF9EbAzgC1FlCR9kqMaa6fGYArYq5vHzpRj2frCAndEw/viewform");
        cadastro.getSettings().setJavaScriptEnabled(true);

        cadastro.setWebViewClient(new WebViewClient());
    }

}
