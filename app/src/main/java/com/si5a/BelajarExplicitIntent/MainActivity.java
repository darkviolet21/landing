package com.si5a.BelajarExplicitIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText etNama;
    ImageView img_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_2 = findViewById(R.id.img_2);
        img_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
//        getSupportActionBar().setTitle("Page 1");
//
//        btnPindah = findViewById(R.id.btn_pindah);
//        etNama = findViewById(R.id.et_nama);

//
//        btnPindah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String nama = etNama.getText().toString();
//
//                if (nama.trim().equals("")){
//                    etNama.setError("Nama Harus Diisi");
//                }
//                else {
//                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
//                    pindah.putExtra("xNama", nama);
//                    startActivity(pindah);
//                }
//
//            }
//        });
    }
}