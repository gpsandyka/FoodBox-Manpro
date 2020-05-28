package com.example.foodbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PengembalianPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembalian_page);

        final EditText idInput = (EditText) findViewById(R.id.input_pengembalian_page);
        final Button kembalikanButton = (Button) findViewById(R.id.kembalikan_button_pengembalian_page);
        kembalikanButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FoodBox temp = DatabaseFoodBox.searchFoodBoxByID(Integer.parseInt(idInput.getText().toString()));
                if (temp != null & temp.getStatus() == Status.BORROWED) {
                    FoodBox.returnFoodBox(temp);
                    Intent i = new Intent(PengembalianPage.this,NotifikasiPengembalianBerhasil.class);
                    startActivity(i);
                    finish();
                }
                else {
                    // Muncul notif ID tidak ditemukan
                }
            }
        });
    }
}
