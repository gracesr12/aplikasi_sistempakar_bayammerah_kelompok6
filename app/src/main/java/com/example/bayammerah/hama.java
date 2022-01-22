package com.example.bayammerah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class hama extends AppCompatActivity {
    ImageButton ulatdaun, ulatpenggulung, belalang, kutudaun, siput, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hama);

        ulatdaun = findViewById(R.id.ulatdaun);
        ulatpenggulung = findViewById(R.id.ulatpenggulung);
        belalang = findViewById(R.id.belalang);
        kutudaun = findViewById(R.id.kutudaun);
        siput = findViewById(R.id.siput);
        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
        ulatdaun.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, sposdopteraplusiahymenia.class);
            finish();
            startActivity(intent);
        });
        ulatpenggulung.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, hymeniarecurvalisfebricus.class);
            finish();
            startActivity(intent);
        });
        belalang.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, sexavaspp.class);
            finish();
            startActivity(intent);
        });
        kutudaun.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, myzuspersicuse.class);
            finish();
            startActivity(intent);
        });
        siput.setOnClickListener(v -> {
            Intent intent = new Intent(hama.this, serangansiputataubekicot.class);
            finish();
            startActivity(intent);
        });
    }
}