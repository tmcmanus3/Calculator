package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onAdd(View view) {
        EditText input1 = (EditText) findViewById(R.id.FirstNumber);
        EditText input2 = (EditText) findViewById(R.id.SecondNumber);
        Integer int1 = Integer.parseInt(input1.getText().toString());
        Integer int2 = Integer.parseInt(input2.getText().toString());

        goToActivity2(String.valueOf(int1+int2));
    }

    public void onSubtract(View view) {
        EditText input1 = (EditText) findViewById(R.id.FirstNumber);
        EditText input2 = (EditText) findViewById(R.id.SecondNumber);
        Integer int1 = Integer.parseInt(input1.getText().toString());
        Integer int2 = Integer.parseInt(input2.getText().toString());

        goToActivity2(String.valueOf(int1-int2));
    }

    public void onMultiply(View view) {
        EditText input1 = (EditText) findViewById(R.id.FirstNumber);
        EditText input2 = (EditText) findViewById(R.id.SecondNumber);
        Integer int1 = Integer.parseInt(input1.getText().toString());
        Integer int2 = Integer.parseInt(input2.getText().toString());

        goToActivity2(String.valueOf(int1*int2));
    }

    public void onDivide(View view) {
        EditText input1 = (EditText) findViewById(R.id.FirstNumber);
        EditText input2 = (EditText) findViewById(R.id.SecondNumber);
        Integer int1 = Integer.parseInt(input1.getText().toString());
        Integer int2 = Integer.parseInt(input2.getText().toString());

        goToActivity2(String.valueOf(int1/int2));
    }

    public void goToActivity2(String str) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", str);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}