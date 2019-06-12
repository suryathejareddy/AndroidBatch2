package com.example.sixthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name,rollno,department,contactno,email,username,password;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    EditText e7;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.etname);
        e2=findViewById(R.id.etrollno);
        e3=findViewById(R.id.etdepartment);
        e4=findViewById(R.id.etcontactno);
        e5=findViewById(R.id.etmail);
        e6=findViewById(R.id.etusername);
        e7=findViewById(R.id.etpassword);
        b=findViewById(R.id.bt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=e1.getText().toString();
                rollno=e2.getText().toString();
                department=e3.getText().toString();
                contactno=e4.getText().toString();
                email=e5.getText().toString();
                username=e6.getText().toString();
                password=e7.getText().toString();

                Intent i=new Intent(MainActivity.this,Displaypage.class);
                i.putExtra("name",name);
                i.putExtra("rollno",rollno);
                i.putExtra("department",department);
                i.putExtra("contactno",contactno);
                i.putExtra("email",email);
                i.putExtra("username",username);
                i.putExtra("password",password);
startActivity(i);
            }
        });
    }
}
