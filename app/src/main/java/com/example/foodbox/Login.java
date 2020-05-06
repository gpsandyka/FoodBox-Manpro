package com.example.foodbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
                startActivity(new Intent(Login.this, SignUp.class));
            }
        });
    }
}
