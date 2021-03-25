package com.gokul.resourcesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
//        add click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TheButtonIsClicked();
            }
        });

//        decalring edittext
        editText=findViewById(R.id.name);

    }

    public void TheButtonIsClicked(){
//        we will make a message to display in the log
        Log.v("edittext","the message is"+editText.getText().toString());
    }
}