package com.example.danielortizagudelo.colombiat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class turismo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
        Button volver3;

        volver3=(Button) findViewById(R.id.volver3);

        volver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(turismo.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
