package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextSatu, editTextDua;
    Button buttonPlus, buttonMin, buttonBagi, buttonKali, buttonClear;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSatu = (EditText) findViewById(R.id.editTextSatu);
        editTextDua = (EditText) findViewById(R.id.editTextDua);
        textViewHasil = (TextView) findViewById(R.id.textViewHasil);

        buttonBagi = (Button) findViewById(R.id.buttonBagi);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonMin = (Button) findViewById(R.id.buttonMin);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);

        buttonClear = (Button) findViewById(R.id.buttonClear);

        buttonPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                int nilaiA = Integer.parseInt(editTextSatu.getText().toString());
                int nilaiB = Integer.parseInt(editTextDua.getText().toString());

                int hasil = nilaiA + nilaiB;

                textViewHasil.setText(String.valueOf(hasil));
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                int nilaiA = Integer.parseInt(editTextSatu.getText().toString());
                int nilaiB = Integer.parseInt(editTextDua.getText().toString());

                int hasil = nilaiA - nilaiB;

                textViewHasil.setText(String.valueOf(hasil));
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                int nilaiA = Integer.parseInt(editTextSatu.getText().toString());
                int nilaiB = Integer.parseInt(editTextDua.getText().toString());

                int hasil = nilaiA * nilaiB;

                textViewHasil.setText(String.valueOf(hasil));
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                int nilaiA = Integer.parseInt(editTextSatu.getText().toString());
                int nilaiB = Integer.parseInt(editTextDua.getText().toString());

                int hasil = nilaiA / nilaiB;

                textViewHasil.setText(String.valueOf(hasil));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                editTextSatu.setText(null);
                editTextDua.setText(null);
                textViewHasil.setText(null);
            }
        });

    }
}