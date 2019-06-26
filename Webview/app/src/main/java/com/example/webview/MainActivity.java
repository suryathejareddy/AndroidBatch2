package com.example.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btnfb);
        b2=findViewById(R.id.btnin);
        b3=findViewById(R.id.btnsp);
        b4=findViewById(R.id.btntw);
        b5=findViewById(R.id.btnwt);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s1="https://www.facebook.com/";
               Intent i1=new Intent(MainActivity.this,webview2.class);
               i1.putExtra("url",s1);
               startActivity(i1);

           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2="https://play.google.com/store/apps/details?id=com.instagram.android&hl=en_IN/";
                Intent i2=new Intent(MainActivity.this,webview2.class);
                i2.putExtra("url",s2);
                startActivity(i2);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s3="https://play.google.com/store/apps/details?id=com.snapchat.android&hl=en_IN/";
                Intent i3=new Intent(MainActivity.this,webview2.class);
                i3.putExtra("url",s3);
                startActivity(i3);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s4="https://twitter.com/login/";
                Intent i4=new Intent(MainActivity.this,webview2.class);
                i4.putExtra("url",s4);
                startActivity(i4);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s5="https://play.google.com/store/apps/details?id=com.whatsapp&hl=en/";
                Intent i5=new Intent(MainActivity.this,webview2.class);
                i5.putExtra("url",s5);
                startActivity(i5);
            }
        });


    }
}
