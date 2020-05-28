package com.example.foodbox;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText usernameText = (EditText) findViewById(R.id.username_text_signup);
        final EditText passwordText = (EditText) findViewById(R.id.password_text_signup);
        final EditText passwordConfirmText = (EditText) findViewById(R.id.password_text_confirm_signup);
        final EditText emailText = (EditText) findViewById(R.id.email_text_signup);
        final EditText noTelpText = (EditText) findViewById(R.id.no_telpon_text_signup);
        final TextView notifikasi = (TextView) findViewById(R.id.notifikasi_text_view_signup);

        final Button signupButton = (Button) findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //fixme bikin regex buat email + check username duplikat
                if (passwordText.getText().toString().equals(passwordConfirmText.getText().toString())) {
                    DatabaseUser.signup(emailText.getText().toString(), noTelpText.getText().toString(), usernameText.getText().toString(), passwordText.getText().toString());
                    //notifikasi.setText("Anda berhasil mendaftarkan diri!");
                    Intent resultIntent = new Intent();
                    setResult(Activity.RESULT_OK, resultIntent);

                    finish(); //Ini buat nutup langsung activity ini
                }
                else {
                    //todo ngapain kalau gagal
                    notifikasi.setText("Anda gagal mendaftarkan diri!");
                }
            }
        });


    }


}
