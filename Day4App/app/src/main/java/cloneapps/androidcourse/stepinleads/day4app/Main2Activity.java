package cloneapps.androidcourse.stepinleads.day4app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
String name,phone;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.tv);
        Bundle b=getIntent().getExtras();
        name=b.get("name").toString();
        phone=b.get("phone").toString();
        t.setText("Name of the person is"+name+"  phne no is"+phone);
    }
}
