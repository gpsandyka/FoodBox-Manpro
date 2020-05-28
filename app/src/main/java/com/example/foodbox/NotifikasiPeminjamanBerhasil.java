package com.example.foodbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NotifikasiPeminjamanBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi_peminjaman_berhasil);

        Bundle extras = getIntent().getExtras();
        int[] id = extras.getIntArray("ID");

        final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_berhasil_pinjam);
        String textNotif = "Peminjaman FoodBox anda berhasil\n ID FoodBox yang dipinjam : \n";
        for (int temp : id) {
            textNotif = textNotif + temp + "\n";
        }
        notifikasi.setText(textNotif);
    }
}
