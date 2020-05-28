package com.example.foodbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        final Button peminjamanButton = (Button) findViewById(R.id.peminjaman_mainpage);
        peminjamanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainPage.this, PeminjamanPage.class));
            }
        });

        final Button pengembalianButton = (Button) findViewById(R.id.pengembalian_mainpage);
        pengembalianButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainPage.this, PengembalianPage.class));
            }
        });
    }
}
