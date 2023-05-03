package com.example.regiraj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void Login(View view) {
        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
    }

   /* public void mainActivity(View view) {
        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));

    }
*/

    public void homeActivity(View view) {
        startActivity(new Intent(RegistrationActivity.this,HomeActivity.class));
    }
}