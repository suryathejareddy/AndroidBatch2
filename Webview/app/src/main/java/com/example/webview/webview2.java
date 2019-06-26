package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webview2 extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview2);
        w=findViewById(R.id.webview);
        Bundle b=getIntent().getExtras();
        String s1=b.get("url").toString();
        w.loadUrl(s1);
        String s2=b.get("url").toString();
        w.loadUrl(s2);
        String s3=b.get("url").toString();
        w.loadUrl(s3);
        String s4=b.get("url").toString();
        w.loadUrl(s4);
        String s5=b.get("url").toString();
        w.loadUrl(s5);
    }
}
