package com.example.danielortizagudelo.notasapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eExpo, ePrac, eProy, eNotaFinal;
    Button bCalc;
    Double expX= Double.valueOf(15),praX= Double.valueOf(50),proX= Double.valueOf(35);






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eExpo=(EditText) findViewById(R.id.eExpo);
        ePrac=(EditText) findViewById(R.id.ePrac);
        eProy=(EditText) findViewById(R.id.eProy);
        eNotaFinal=(EditText) findViewById(R.id.eNotaFinal);
        bCalc=(Button) findViewById(R.id.bCalc);

        bCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double notaF;

                notaF=Double.parseDouble(eExpo.getText().toString())*expX/100+
                        Double.parseDouble(ePrac.getText().toString())*praX/100+
                        Double.parseDouble(eProy.getText().toString())*proX/100;

                eNotaFinal.setText(String.valueOf(notaF));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        if(id==R.id.mConfig){

            //Toast.makeText(this,"Presionó confuguración", Toast.LENGTH_LONG).show();

            Intent intent= new Intent(this, SettingsActivity.class);
            intent.putExtra("pExpo",expX);
            intent.putExtra("pPrac",praX);
            intent.putExtra("pProy",proX);
            startActivityForResult(intent, 1234);
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){

        if(requestCode==1234 && resultCode==RESULT_OK){

            String exp,pra,pro;

            exp=data.getExtras().getString("npExpo");
            pra=data.getExtras().getString("npPrac");
            pro=data.getExtras().getString("npProy");

            expX=Double.parseDouble(exp);
            praX=Double.parseDouble(pra);
            proX=Double.parseDouble(pro);



            Toast.makeText(MainActivity.this, "Nuevos datos: Exposiciones: "+exp+" Prácticas: "+pra+
                    " Proyecto: "+pro, Toast.LENGTH_LONG).show();



        }

    }

}
