package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class YoutubeBvbBr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_bvbbr);

        WebView youtube = findViewById(R.id.webview2);
        youtube.loadUrl("https://www.youtube.com/watch?v=FjMpJKaEz20&t=414s");
        youtube.getSettings().setJavaScriptEnabled(true);
        youtube.setWebViewClient(new WebViewClient());
    }
}
