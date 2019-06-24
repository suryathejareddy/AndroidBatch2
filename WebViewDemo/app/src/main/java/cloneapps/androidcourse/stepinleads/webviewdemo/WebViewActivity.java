package cloneapps.androidcourse.stepinleads.webviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b=getIntent().getExtras();
        String s=b.get("url").toString();
        setContentView(R.layout.activity_web_view);
        w=findViewById(R.id.webview);
        w.loadUrl(s);
    }
}
