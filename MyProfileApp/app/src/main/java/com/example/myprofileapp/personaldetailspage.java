package com.example.myprofileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class personaldetailspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaldetailspage);
        Bundle b2=getIntent().getExtras();
    }
}
