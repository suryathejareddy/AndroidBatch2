package com.android.stepinleads.myapplication;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Entry extends StringRequest {
    private static final String URL="https://unprevented-hatchet.000webhostapp.com/inserting.php/";
    private Map<String,String> params;
    public Entry( Data d,Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        params=new HashMap<>();
        params.put("Name",d.name);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }}
