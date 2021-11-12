package com.example.solver_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonclear);
        button.setOnClickListener(this);
        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button buttonspace = findViewById(R.id.buttonspace);
        buttonspace.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if (R.id.buttonclear == v.getId()) {
            EditText editText = findViewById(R.id.editTextTextPersonName);
            editText.setText("");
        }

    }
}