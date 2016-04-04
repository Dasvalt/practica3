package com.example.danielortizagudelo.colombiat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        if(id==R.id.mConfig){

            Intent intent=new Intent(this,acerca.class);
            startActivity(intent);

        }




        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button hoteles,bares, turismo, demografica, volver;

        bares=(Button) findViewById(R.id.bares);
        hoteles=(Button) findViewById(R.id.hoteles);
        turismo=(Button) findViewById(R.id.turismo);
        demografica=(Button) findViewById(R.id.demografica);


        bares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,bares.class);
                startActivity(intent);


            }
        });

        hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(MainActivity.this,hoteles.class);
                startActivity(intent2);
            }
        });

        turismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,turismo.class);
                startActivity(intent);
            }
        });

        demografica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,demografica.class);
                startActivity(intent);
            }
        });






    }
}
