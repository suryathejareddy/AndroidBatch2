package cloneapps.androidcourse.stepinleads.webviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btnfb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="https://www.facebook.com/";

                Intent i=new Intent(MainActivity.this,WebViewActivity.class);
                i.putExtra("url",s);
                startActivity(i);
            }
        });
    }
}
