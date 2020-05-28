package com.example.foodbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NotifikasiPengembalianBerhasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi_pengembalian_berhasil);

        final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_berhasil_kembali);
        String textNotif = "Pengembalian FoodBox anda berhasil \nTerima kasih telah menggunakan jasa kami";
        // disini ada for dan masukkin id id nya ke string
        notifikasi.setText(textNotif);
    }
}
