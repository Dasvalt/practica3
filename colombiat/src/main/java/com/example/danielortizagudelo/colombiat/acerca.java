package com.example.danielortizagudelo.colombiat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);

        Button volverM;

        volverM=(Button) findViewById(R.id.volverM);

        volverM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(acerca.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
