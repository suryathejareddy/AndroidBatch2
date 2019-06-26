package com.example.fullstackform;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;



    public class Entry extends StringRequest {
        private static final String URL="https://unprevented-hatchet.000webhostapp.com/UserForm.php/";
        private Map<String,String> params;
        public Entry( Data d,Response.Listener<String> listener) {
            super(Request.Method.POST, URL, listener, null);
            params=new HashMap<>();
            params.put("Name",d.name);
            params.put("Rollno",d.rollno);
            params.put("Department",d.department);
            params.put("Contactno",d.contactno);
            params.put("Mail",d.mail);
            params.put("Username",d.username);
            params.put("Password",d.password);
        }
        @Override
        public Map<String, String> getParams() {
            return params;
        }
    }

