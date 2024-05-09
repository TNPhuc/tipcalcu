package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText Bill, Tip, Tip2, Total;
    Button calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bill = findViewById(R.id.Bill);
        Tip = findViewById(R.id.Tip);
        Tip2 = findViewById(R.id.Tip2);
        Total = findViewById(R.id.Total);
        calculator = findViewById(R.id.calculator);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(Bill.getText().toString());
                float b = Float.parseFloat(Tip.getText().toString());
                float d = (a * b) / 100;
                float c = a + d;

                NumberFormat format = NumberFormat.getCurrencyInstance();
                Tip2.setText(format.format(d));
                Total.setText(format.format(c));
            }
        });
    }
}