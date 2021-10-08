package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.InputType;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final EditText hasil =
                (EditText)findViewById(R.id.output_hasil);
                hasil.setInputType(InputType.TYPE_NULL);
        final Button hitung = (Button)findViewById(R.id.btn_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String isialas = alas.getText().toString();
                String isitinggi = tinggi.getText().toString();
                double alas = Double.parseDouble(isialas);
                double tinggi = Double.parseDouble(isitinggi);
                double hs = LuasSegitiga(alas,tinggi);
                String output = String.valueOf(hs);
                hasil.setText(output.toString());
            }
        });
    }
    public double LuasSegitiga(double alas, double tinggi){return alas*tinggi/2;}
}