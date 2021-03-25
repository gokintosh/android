package com.gokul.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    declaring the widgets
    EditText editText;
    TextView appTitle,heading,poundSupport,valueInPound;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        instantiating the widgets

        appTitle=findViewById(R.id.apptitile);
        heading=findViewById(R.id.heading);
        poundSupport=findViewById(R.id.poundsupport);
        valueInPound=findViewById(R.id.valuePound);

        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.buttonconvert);

//        adding click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                calling convert method
                ConvertFromKiloToPound()
            }
        });
    }

    private void ConvertFromKiloToPound() {

//        this method converts kilo to pounds
        String valueEnteredKilo=editText.getText().toString();
//        converting value to number
        double Kilo=Double.parseDouble(valueEnteredKilo);
        double pound=Kilo*2.20;
        valueInPound.setText(""+pound);
    }
}