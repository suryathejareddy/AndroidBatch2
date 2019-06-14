package com.example.loginid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name ,rollno,age,emailid,username,password;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=findViewById(R.id.etname);
        e2=findViewById(R.id.etrollno);
        e3=findViewById(R.id.etage);
        e4=findViewById(R.id.etemailid);
        e5=findViewById(R.id.etusername);
        e6=findViewById(R.id.etpassword);
        b =findViewById(R.id.bt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=e1.getText().toString();
                rollno=e2.getText().toString();
                age=e3.getText().toString();
                emailid=e4.getText().toString();
                username=e5.getText().toString();
                password=e6.getText().toString();
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name",name);
                i.putExtra("rollno",rollno);
                i.putExtra("age",age);
                i.putExtra("emailid",emailid);
                i.putExtra("password",password);


            }
        });






    }
}