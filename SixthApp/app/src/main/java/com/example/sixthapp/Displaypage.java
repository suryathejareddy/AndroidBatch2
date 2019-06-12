package com.example.sixthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Displaypage extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    String name,rollno,department,contactno,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaypage);
        t1=findViewById(R.id.tvname);
        t2=findViewById(R.id.tvrollno);
        t3=findViewById(R.id.tvdepartment);
        t4=findViewById(R.id.tvcontactno);
        t5=findViewById(R.id.tvemail);
        Bundle b=getIntent().getExtras();
        name=b.get("name").toString();
        t1.setText(name);
        name=b.get("rollno").toString();
        t2.setText(rollno);
        name=b.get("department").toString();
        t3.setText(department);
        name=b.get("contactno").toString();
        t4.setText(contactno);
        name=b.get("email").toString();
        t5.setText(email);


    }
}
