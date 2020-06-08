package com.example.foodbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class PeminjamanPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman_page);

        final Spinner spinnerUkuran = (Spinner) findViewById(R.id.ukuran_spinner);
        final Spinner spinnerWarna = (Spinner) findViewById(R.id.warna_spinner);
        final EditText jumlahText = (EditText) findViewById(R.id.jumlah_edittext);

        ArrayAdapter<CharSequence> adapterUkuran = ArrayAdapter.createFromResource(this,
                R.array.Ukuran, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterUkuran.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerUkuran.setAdapter(adapterUkuran);

        ArrayAdapter<CharSequence> adapterWarna = ArrayAdapter.createFromResource(this,
                R.array.Warna, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterWarna.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerWarna.setAdapter(adapterWarna);


        final Button pinjamButton = (Button) findViewById(R.id.pinjam_button);
        pinjamButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //todo kalau pencet pinjam
                String ukuran = spinnerUkuran.getSelectedItem().toString();
                String warna = spinnerWarna.getSelectedItem().toString();
                int jumlah;
                try {
                    jumlah = Integer.parseInt(jumlahText.getText().toString());
                }
                catch (NullPointerException | NumberFormatException e) {
                    jumlah = 0;
                }
                if (!ukuran.equals("Ukuran") && !warna.equals("Warna") && jumlah !=0) {
                    String[] id = {"2905202010011","2905202010012"};
                    // idnya benerin nanti
                    Intent i = new Intent(PeminjamanPage.this,NotifikasiPeminjamanBerhasil.class);
                    i.putExtra("ID", id);
                    startActivity(i);
                    finish();
                }
                else {
                    //todo kalau inputnya salah
                }

            }
        });

    }
}
