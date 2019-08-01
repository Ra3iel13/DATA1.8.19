package com.example.myapplication1819;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tx_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx_date=findViewById(R.id.tx_date);
        final Intent intent= getIntent();

        String Numbers=intent.getStringExtra("data");


        tx_date.setText(Numbers);



    }
}
