package com.bvbbr.bvb_brasil;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EnderecoBvbBr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.endereco_bvbbr);

        WebView endereco = findViewById(R.id.webview5);
        endereco.loadUrl("https://www.google.com/maps/place/Quintal+do+Espeto+-+Unidade+Pav%C3%A3o/@-23.6070376,-46.6679269,15z/data=!4m5!3m4!1s0x0:0x830051e12f78abf5!8m2!3d-23.6070376!4d-46.6679269");
        endereco.getSettings().setJavaScriptEnabled(true);

        endereco.setWebViewClient(new WebViewClient());
    }
}