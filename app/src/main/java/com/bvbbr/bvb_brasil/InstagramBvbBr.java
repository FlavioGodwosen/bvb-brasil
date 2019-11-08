package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstagramBvbBr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram_bvbbr);

        WebView instagram = findViewById(R.id.webview1);
        instagram.loadUrl("https://www.instagram.com/_bvb09brasil");

        instagram.getSettings().setJavaScriptEnabled(true);

        instagram.setWebViewClient(new WebViewClient());

    }
}


