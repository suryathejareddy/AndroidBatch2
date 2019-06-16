package com.example.myprofileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class hobbies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        Bundle b4=getIntent().getExtras();
    }
}
