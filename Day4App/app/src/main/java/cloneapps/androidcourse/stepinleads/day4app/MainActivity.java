package cloneapps.androidcourse.stepinleads.day4app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1;
String name,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.etname);
        e2.findViewById(R.id.etphone);
        b1=findViewById(R.id.btnxt);
        b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              name=e1.getText().toString();
              phone=e2.getText().toString();
               Intent i=new Intent(MainActivity.this,Main2Activity.class);
               i.putExtra("name",name);
               i.putExtra("phone",phone);
               startActivity(i);

           }
        });
    }
}
