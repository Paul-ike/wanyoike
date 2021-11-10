package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayConverterActivity extends AppCompatActivity {

//    Declaring Widgets
    EditText valueInMetersFromUser;
    TextView valueInCMs;
    Button convertionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_converter);

        valueInMetersFromUser = findViewById(R.id.amountInMetersInput);
        valueInCMs = findViewById(R.id.valueinCm);
        convertionBtn = findViewById(R.id.convertionBtn);

        convertionBtn.setOnClickListener(v -> convertFromMetersToCm());
    }

    private void convertFromMetersToCm() {
        String valueInMeters = valueInMetersFromUser.getText().toString();
        double meters = Double.parseDouble(valueInMeters);
        double cm = (meters * 100);

        valueInCMs.setText(""+cm);

    }
}