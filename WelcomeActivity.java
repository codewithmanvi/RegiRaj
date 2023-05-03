package com.example.regiraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

    public void register(View view) {
        startActivity(new Intent(WelcomeActivity.this,RegistrationActivity.class));
    }

    public void Login(View view) {
        startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
    }
}