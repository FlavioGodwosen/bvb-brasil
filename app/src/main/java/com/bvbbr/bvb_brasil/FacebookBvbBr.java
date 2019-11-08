package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookBvbBr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facebook_bvbbr);

        WebView facebook = findViewById(R.id.webview3);
        facebook.loadUrl("https://www.facebook.com/BVBBR09/");

        facebook.getSettings().setJavaScriptEnabled(true);

        facebook.setWebViewClient(new WebViewClient());
    }
}
