package com.example.regiraj;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
    }

   /* public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));

    }*/


    public void homeActivity(View view) {
        startActivity(new Intent(LoginActivity.this,HomeActivity.class));
    }
}