package com.gokul.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        button=findViewById(R.id.login);

        String emailTxt=email.getText().toString();
        String passwordTxt=password.getText().toString();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ActivityB.class);
                i.putExtra("email",emailTxt);
                i.putExtra("pass",passwordTxt);
                startActivity(i);
            }
        });


    }

    private void GoToActivityB() {


    }
}