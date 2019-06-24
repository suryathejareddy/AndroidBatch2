package cloneapps.androidcourse.stepinleads.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
RadioGroup r;
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=findViewById(R.id.rdgrp);
        t=findViewById(R.id.tv);


        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                t.setVisibility(View.VISIBLE);
               RadioButton rb=null;
                if(checkedId==R.id.radioButton)
                {

                    rb=findViewById(R.id.radioButton);
                }
                if(checkedId==R.id.radioButton2)
                {

                    rb=findViewById(R.id.radioButton2);
                }
                if(checkedId==R.id.radioButton3)
                {

                    rb=findViewById(R.id.radioButton3);
                }
                t.setText(rb.getText().toString());
            }
        });
    }
}
