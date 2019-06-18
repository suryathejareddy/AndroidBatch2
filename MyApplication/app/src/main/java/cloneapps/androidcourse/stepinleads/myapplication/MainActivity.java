package cloneapps.androidcourse.stepinleads.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s="";
CheckBox c1,c2,c3,c4;
Button b;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        b=findViewById(R.id.button);
        t=findViewById(R.id.tv);
       /* c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    t.setVisibility(View.VISIBLE);
                    t.setText(c1.getText().toString());
                }
            }
        });*/
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               s="";
              if(c1.isChecked())
              {
                  s=s+c1.getText().
                          toString();
              }
               if(c2.isChecked())
               {
                   s=s+c2.getText().
                           toString();
               }
               if(c3.isChecked())
               {
                   s=s+c3.getText().
                           toString();
               }
               if(c4.isChecked())
               {
                   s=s+c4.getText().
                           toString();
               }
               t.setVisibility(View.VISIBLE);
              t.setText(s);
           }
       });
    }
}
