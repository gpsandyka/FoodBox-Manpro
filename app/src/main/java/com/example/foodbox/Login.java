package com.example.foodbox;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Login extends AppCompatActivity {

    final int SIGNUP_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        CreateDummyItem();

        final EditText usernameText = (EditText) findViewById(R.id.username_text_login);
        final EditText passwordText = (EditText) findViewById(R.id.password_text_login);
        final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_text_view_login);

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                User temp = DatabaseUser.loginVerification(usernameText.getText().toString(), passwordText.getText().toString());
                if (temp != null) {
                    startActivity(new Intent(Login.this, MainPage.class));
                }
                else {
                    //todo ngapain kalau gagal login
                    notifikasi.setText("Anda gagal login!\nPastikan username dan password benar!");
                }
            }
        });

        final TextView signUpText = (TextView) findViewById(R.id.signup_text);
        signUpText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivityForResult(new Intent(Login.this, SignUp.class), SIGNUP_CODE);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case (SIGNUP_CODE) : {
                final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_text_view_login);
                if (resultCode == Activity.RESULT_OK) {
                    notifikasi.setText("Anda berhasil mendaftarkan diri!");
                }
                else  {
                    notifikasi.setText("");
                }
                break;
            }
        }
    }

    private void CreateDummyItem() {
        //Item dummy buat percobaan
        ArrayList<User> temp = DatabaseUser.getUserDatabase();
        temp.add(new User("ff", "23", "23", "daika@gmail.com"));
        DatabaseUser.setUserDatabase(temp);
        int i;
        // Yang small merah
        for (i=0; i< 15; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Small", 5000,  "Merah", "290520201" + new DecimalFormat("0000").format(i)));
        }
        for (i=10; i< 15; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520201" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Medium merah
        for (i=15; i< 30; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Medium", 7000,  "Merah", "290520201" + new DecimalFormat("0000").format(i)));
        }
        for (i=25; i< 30; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520201" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Large merah
        for (i=30; i< 45; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Large", 10000,  "Merah", "290520201" + new DecimalFormat("0000").format(i)));
        }
        for (i=40; i< 45; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520201" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }

        // Yang small hijau
        for (i=0; i< 15; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Small", 5000,  "Hijau", "290520202" + new DecimalFormat("0000").format(i)));
        }
        for (i=10; i< 15; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520202" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Medium hijau
        for (i=15; i< 30; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Medium", 7000,  "Hijau", "290520202" + new DecimalFormat("0000").format(i)));
        }
        for (i=25; i< 30; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520202" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Large hijau
        for (i=30; i< 45; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Large", 10000,  "Hijau", "290520202" + new DecimalFormat("0000").format(i)));
        }
        for (i=40; i< 45; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520202" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        //End of Item dummy

        // Yang small biru
        for (i=0; i< 15; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Small", 5000,  "Biru", "290520204" + new DecimalFormat("0000").format(i)));
        }
        for (i=10; i< 15; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520204" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Medium biru
        for (i=15; i< 30; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Medium", 7000,  "Biru", "290520204" + new DecimalFormat("0000").format(i)));
        }
        for (i=25; i< 30; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520204" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
        // Yang Large biru
        for (i=30; i< 45; i++) {
            DatabaseFoodBox.addFoodBox(new FoodBox("Large", 10000,  "Biru", "290520204" + new DecimalFormat("0000").format(i)));
        }
        for (i=40; i< 45; i++) {
            DatabaseFoodBox.searchFoodBoxByID("290520204" + new DecimalFormat("0000").format(i)).setStatus(Status.BORROWED);
        }
    }
}
