package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TwitterBvbBr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitter_bvbbr);

        WebView twitter = findViewById(R.id.webview);
        twitter.loadUrl("https://twitter.com/bdortmundbr09");

        twitter.getSettings().setJavaScriptEnabled(true);

        twitter.setWebViewClient(new WebViewClient());

    }
}
