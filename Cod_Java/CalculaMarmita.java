package com.example.testando;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText mesesano,p,dm;
    TextView g;
    RadioButton mensal,anual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        g=(findViewById(R.id.g));
        p=(findViewById(R.id.p));
        dm=(findViewById(R.id.dm));
        mesesano=(findViewById(R.id.mesesano));
        anual=(findViewById(R.id.anual));
        mensal=(findViewById(R.id.mensal));
    }


    public void calcular(View c){
        float gasto,preco;
        int meses,diasmes;
        String escolha=" ";
        gasto = 0 ;
        diasmes =Integer.parseInt(dm.getText().toString());
        meses =Integer.parseInt(mesesano.getText().toString());
        preco = Integer.parseInt(p.getText().toString());
        //escolha=Toast.makeText("Digite sua escolha : ");
       if (mensal.isChecked()){
            escolha = "mensal";
           gasto=preco*diasmes;

       }
       //escolha.equals("anual"
       else if(anual.isChecked()){
           escolha="anual";
           gasto=preco*diasmes*meses;

       }
       g.setText("O gasto "+escolha+" é "+gasto);

    }

}
