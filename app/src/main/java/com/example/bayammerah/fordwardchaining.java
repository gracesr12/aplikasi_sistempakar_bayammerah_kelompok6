package com.example.bayammerah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fordwardchaining extends AppCompatActivity {

    CheckBox ChckDaunBerlubang,
            ChckDauntinggaltulang,
            ChckDaunmenggulung,
            ChckDaunrusak,
            ChckDaunlayu,
            ChckBatanglayu,
            ChckDaunrusakbusuk;


    ImageButton back, btnProsesDeteksi;
    TextView tvOutputNamaPenyakit, cek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fordwardchaining);

        ChckDaunrusakbusuk = (CheckBox) findViewById(R.id.penyakit);
        ChckDaunBerlubang = (CheckBox) findViewById(R.id.penyakit1);
        ChckDauntinggaltulang = (CheckBox) findViewById(R.id.penyakit2);
        ChckDaunmenggulung = (CheckBox) findViewById(R.id.penyakit3);
        ChckDaunrusak = (CheckBox) findViewById(R.id.penyakit4);
        ChckDaunlayu = (CheckBox) findViewById(R.id.penyakit5);
        ChckBatanglayu = (CheckBox) findViewById(R.id.penyakit6);

        back = findViewById(R.id.back);
        btnProsesDeteksi = (ImageButton) findViewById(R.id.imageButton);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.textView);
        cek = findViewById(R.id.cek);

        tvOutputNamaPenyakit.setText(""); // Kosongkan textView / Nama Penyakit Saat membuka program Sisitem Pakar

        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaHama = "HAMA BAYAM MERAH : ";



                // Jenis Gejala Untuk Output Penyakit : Ulat Daun
                if (ChckDaunBerlubang.isChecked() && ChckDauntinggaltulang.isChecked() && ChckDaunrusakbusuk.isChecked()) {
                    NamaHama += "\nUlat Daun";
                }
                // Jenis Gejala Untuk Output Penyakit : Ulat Penggulung Daun
                if (ChckDaunBerlubang.isChecked() && ChckDaunmenggulung.isChecked()) {
                    NamaHama += "\nUlat Penggulung Daun";
                }
                // Jenis Gejala Untuk Output Penyakit : Belalang
                if (ChckDaunBerlubang.isChecked()) {
                    NamaHama += "\nBelalang";
                }
                // Jenis Gejala Untuk Output Penyakit : Kutu Daun
                if (ChckDaunrusak.isChecked() && ChckDaunlayu.isChecked() && ChckBatanglayu.isChecked()) {
                    NamaHama += "\nKutu Daun";
                }
                // Jenis Gejala Untuk Output Penyakit : Siput/bekicot
                if (ChckDaunBerlubang.isChecked() && ChckDaunrusak.isChecked()) {
                    NamaHama += "\nSiput/Bekicot";
                }


                // Tampilkan Hasil Nama Penyakit di textView
                tvOutputNamaPenyakit.setText(""+NamaHama);
            }
        });

        cek.setOnClickListener(v -> {
            Intent intent = new Intent(fordwardchaining.this, hama.class);
            finish();
            startActivity(intent);
        });
    }


    // Baris dibawah ini dihapus juga tidak masalah : inti codingnya hanya berada di tombol proses
    public void onCheckboxClicked123 (View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.penyakit:
                str = checked ? "Gejala Daun Rusak Membusuk Dipilih " : "Gejala Daun Rusak Membusuk Tidak Dipilih";
                break;
            case R.id.penyakit1:
                str = checked ? "Gejala Daun Berlubang Dipilih " : "Gejala Daun Berlubang Tidak Dipilih";
                break;
            case R.id.penyakit2:
                str = checked ? "Gejala Daun Tinggal Tulang Dipilih " : "Gejala Daun Tinggal Tulang Tidak Dipilih";
                break;
            case R.id.penyakit3:
                str = checked ? "Gejala Daun Menggulung Dipilih " : "Gejala Daun Menggulung Tidak Dipilih";
                break;
            case R.id.penyakit4:
                str = checked ? "Gejala Daun Rusak Dipilih " : "Gejala Daun Rusak Tidak Dipilih";
                break;
            case R.id.penyakit5:
                str = checked ? "Gejala Daun Layu Dipilih " : "Gejala Layu Tidak Dipilih";
                break;
            case R.id.penyakit6:
                str = checked ? "Gejala Batang Layu Dipilih " : "Gejala Batang Layu Tidak Dipilih";
                break;

        }
        back.setOnClickListener(v -> {
            Intent intent = new Intent(fordwardchaining.this, MainActivity.class);
            finish();
            startActivity(intent);
        });

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }



//    void showMessage(String message){
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
}