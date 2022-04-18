package com.example.cheveroletgeoespacialprisma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rbAt,rbAbpA,rbNl,rbAbpv,rbAf,rbV,rbA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        rbAt = findViewById(R.id.rbAt);
        rbAbpA =findViewById(R.id.rbAbpA);
        rbNl = findViewById(R.id.rbNl);
        rbAbpv =findViewById(R.id.rbAbpv);
        rbAf =findViewById(R.id.rbAf);
        rbV=findViewById(R.id.rbV);
        rbA = findViewById(R.id.rbA);
    }
    public void prosseguir(View button){
        Intent i = new Intent(this,Telacalculo.class);
            if(rbAt.isChecked()){ // formula da area total at= 2*Ab* N*F
             Telacalculo.conta = 1;
                startActivity(i);
            }
           else if(rbAbpA.isChecked()){
                Telacalculo.conta = 2;
                startActivity(i);
                // formula da area da base pela area total ab=At-N*F/2
            }
            else if(rbNl.isChecked()){
                Telacalculo.conta = 3;
                startActivity(i);
                //formula da area da base pelo volume (ab= V/H)
            }
           else if(rbAbpv.isChecked()){
                Telacalculo.conta = 4;
                startActivity(i);
               //formula da area da base pelo volume Ab= V/H
            }
            else if (rbAf.isChecked()){
                Telacalculo.conta = 5;
                startActivity(i);
                //formula da area das faces F=(at-2 *Ab)/N
            }
            else if(rbV.isChecked()){
                Telacalculo.conta = 6;
                startActivity(i);
             //formula da area da dos volumes V =Ab*H

            }
            else if(rbA.isChecked()){
                Telacalculo.conta =7;
                startActivity(i);
                //formula da altura H= V/Ab
            }
            else {
                Toast.makeText(this,"Você não selecionou nenhuma opção tente novamente",Toast.LENGTH_LONG).show();
            }
    }

}
