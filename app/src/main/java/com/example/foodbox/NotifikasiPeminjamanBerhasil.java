package com.example.foodbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class NotifikasiPeminjamanBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi_peminjaman_berhasil);

        Bundle extras = getIntent().getExtras();
        ArrayList<String> id = extras.getStringArrayList("ID");

        final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_berhasil_pinjam);
        String textNotif = "Peminjaman FoodBox anda berhasil\n ID FoodBox yang dipinjam : \n";
        for (String temp : id) {
            textNotif = textNotif + temp + "\n";
        }
        notifikasi.setText(textNotif);
    }
}
