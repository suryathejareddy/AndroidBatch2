package com.example.fullstackform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7;
    EditText e1,e2,e3,e4,e5,e6,e7;
    String s1,s2,s3,s4,s5,s6,s7;
    ProgressDialog progress;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.bt);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        t3=findViewById(R.id.tv3);
        t4=findViewById(R.id.tv4);
        t5=findViewById(R.id.tv5);
        t6=findViewById(R.id.tv6);
        t7=findViewById(R.id.tv7);
        e1=findViewById(R.id.etname);
        e2=findViewById(R.id.etrollno);
        e3=findViewById(R.id.etdepartment);
        e4=findViewById(R.id.etcontactno);
        e5=findViewById(R.id.etmail);
        e6=findViewById(R.id.etusername);
        e7=findViewById(R.id.etpassword);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                s7=e7.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("entry", "onResponse: "+response, null);
                        try {
                            progress.hide();

                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(com.example.fullstackform.MainActivity.this);
                                builder.setMessage("Saved successfully")
                                        .setNegativeButton("OK", null)
                                        .create()
                                        .show();

                            }

                            else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(com.example.fullstackform.MainActivity.this);
                                builder.setMessage("Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();

                            }

                        }

                        catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(com.example.fullstackform.MainActivity.this);
                            builder.setMessage(e.getMessage().toString())
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        }
                    }
                };
                progress=new ProgressDialog(com.example.fullstackform.MainActivity.this);
                progress.setIndeterminate(true);
                progress.setTitle("Validating");
                progress.setMessage("Please wait...");
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.show();
                Data d=new Data(s1,s2,s3,s4,s5,s6,s7);
                Entry registerRequest=new Entry(d,responseListener);
                RequestQueue queue = Volley.newRequestQueue(com.example.fullstackform.MainActivity.this);
                queue.add(registerRequest);

            }
        });

    }
    public void EditTextError(EditText e,String s)
    {
        e.setError(s);
    }

}
