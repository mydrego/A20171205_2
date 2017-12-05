package com.example.student.a20171205_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.Response.*;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ListView lv;
    String data[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        RequestQueue queue = Volley.newRequestQueue(this);
        final StringRequest request = new StringRequest("http://www.google.com.tw", new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    final JSONArray array = new JSONArray(response) {

                        JSONObject object = array.getJSONObject(0);
                        String str = object.getString("district");
                        String addr = object.getString("address");
                        StringBuffer sb = new StringBuffer();
                        sb.
                    };
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);
        queue.start();
    }
}