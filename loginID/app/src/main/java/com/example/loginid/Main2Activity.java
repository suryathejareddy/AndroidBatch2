package com.example.loginid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    String name,rollno,age,email,username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.etname);
        t2=(TextView)findViewById(R.id.etrollno);
        t3=(TextView)findViewById(R.id.etage);
        t4=(TextView)findViewById(R.id.etemailid);
        t5=(TextView)findViewById(R.id.etusername);
        t6=(TextView)findViewById(R.id.etpassword);
    }
}
