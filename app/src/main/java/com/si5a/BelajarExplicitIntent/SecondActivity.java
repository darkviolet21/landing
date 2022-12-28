package com.si5a.BelajarExplicitIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
//    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Page 2");

//        tvNama = findViewById(R.id.tv_nama);
//
//        Intent terima = getIntent();
//        String yNama = terima.getStringExtra("xNama");
//        tvNama.setText(yNama);
    }
}