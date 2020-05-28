package com.example.foodbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PeminjamanPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman_page);

        final Button pinjamButton = (Button) findViewById(R.id.pinjam_button);
        pinjamButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int[] id = {123,234};
                // idnya benerin nanti
                Intent i = new Intent(PeminjamanPage.this,NotifikasiPeminjamanBerhasil.class);
                i.putExtra("ID", id);
                startActivity(i);
                finish();
                //todo kalau pencet pinjam
            }
        });

    }
}
