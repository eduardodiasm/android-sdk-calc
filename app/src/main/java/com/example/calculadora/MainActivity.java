package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber = findViewById(R.id.numberOne);
        secondNumber = findViewById(R.id.numberTwo);
        result = findViewById(R.id.result);
    }

    public void sum (View view) {
        int firstValue = Integer.parseInt(firstNumber.getText().toString());
        int secondValue = Integer.parseInt(secondNumber.getText().toString());
        int operationResult = firstValue + secondValue;
        result.setText(String.valueOf(operationResult));
    }

    public void subtract (View view) {
        int firstValue = Integer.parseInt(firstNumber.getText().toString());
        int secondValue = Integer.parseInt(secondNumber.getText().toString());
        int operationResult = firstValue - secondValue;
        result.setText(String.valueOf(operationResult));
    }

    public void divide (View view) {
        int firstValue = Integer.parseInt(firstNumber.getText().toString());
        int secondValue = Integer.parseInt(secondNumber.getText().toString());
        int operationResult = firstValue / secondValue;
        result.setText(String.valueOf(operationResult));
    }

    public void multiply (View view) {
        int firstValue = Integer.parseInt(firstNumber.getText().toString());
        int secondValue = Integer.parseInt(secondNumber.getText().toString());
        int operationResult = firstValue * secondValue;
        result.setText(String.valueOf(operationResult));
    }

}