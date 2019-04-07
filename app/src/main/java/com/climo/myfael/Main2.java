package com.climo.myfael;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv1 = (TextView) findViewById(R.id.tv2);
        TextView tv2 = (TextView) findViewById(R.id.tv4);
       if(getIntent().getExtras() != null) {
           tv1.setText(getIntent().getStringExtra("data1"));
           tv2.setText(getIntent().getStringExtra("data1"));
       }
    }
}
