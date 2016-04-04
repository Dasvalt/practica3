package com.example.danielortizagudelo.colombiat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hoteles extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
        Button volver2;

        volver2=(Button) findViewById(R.id.volver2);

        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(hoteles.this,MainActivity.class);
                startActivity(intent2);
            }
        });

    }
}
