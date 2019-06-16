package com.example.myprofileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Aboutpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpage);
        Bundle b1=getIntent().getExtras();
    }
}
