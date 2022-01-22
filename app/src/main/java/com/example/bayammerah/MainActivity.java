package com.example.bayammerah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton fordward, hama, petunjuk, tentang, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fordward = findViewById(R.id.metode);
        hama = findViewById(R.id.hama);
        tentang = findViewById(R.id.tentang);
        petunjuk = findViewById(R.id.petunjuk);
        back = findViewById(R.id.back);

        fordward.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Penjelasan.class);
            intent.putExtra("id","G001");
            startActivity(intent);
            finish();
        });

        hama.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, hama.class);
            finish();
            startActivity(intent);
        });

        petunjuk.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, petunjuk.class);
            finish();
            startActivity(intent);
        });
        tentang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, tentangkami.class);
            finish();
            startActivity(intent);
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi
            }
        });

    }
}