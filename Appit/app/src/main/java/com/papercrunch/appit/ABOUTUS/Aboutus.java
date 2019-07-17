package com.papercrunch.appit.ABOUTUS;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.papercrunch.appit.R;


public class Aboutus extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        webView=(WebView)findViewById(R.id.webview);
        webView.loadUrl("https://www.papercrunchgoa.com/");

    }
}
