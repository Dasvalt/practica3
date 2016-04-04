package com.example.danielortizagudelo.notasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {


EditText epExpo,epProy,epPrac;
    Button bGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Double exp, pra, pro;

        epExpo=(EditText) findViewById(R.id.epExpo);
        epPrac=(EditText) findViewById(R.id.epPrac);
        epProy=(EditText) findViewById(R.id.epProy);
        bGuardar=(Button) findViewById(R.id.bGuardar);



        Bundle extras= getIntent().getExtras();

        epExpo.setText(String.valueOf(extras.getInt("pExpo")));
        epPrac.setText(String.valueOf(extras.getInt("pPrac")));
        epProy.setText(String.valueOf(extras.getInt("pProy")));



        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();

                intent.putExtra("npExpo",epExpo.getText().toString());
                intent.putExtra("npPrac",epPrac.getText().toString());
                intent.putExtra("npProy",epProy.getText().toString());
                setResult(RESULT_OK,intent);
                finish();




            }
        });



    }
}
