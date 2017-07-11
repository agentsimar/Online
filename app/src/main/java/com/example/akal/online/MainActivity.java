package com.example.akal.online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url="https://myanimelist.net/";
        WebView view=(WebView) this.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
