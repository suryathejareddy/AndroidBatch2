package com.example.myprofileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Educationaldetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educationaldetails);
        Bundle b3=getIntent().getExtras();
    }
}
