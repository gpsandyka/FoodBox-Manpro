package com.example.foodbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PengembalianPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembalian_page);

        final Button kembalikanButton = (Button) findViewById(R.id.kembalikan_button_pengembalian_page);
        kembalikanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //todo kalau pencet kembalikan
            }
        });
    }
}
