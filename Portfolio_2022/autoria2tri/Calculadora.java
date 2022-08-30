package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button zero,um,dois,tres,quatro,cinco,seis,sete,oito,nove,ponto,soma,subtracao,multiplicacao,divisao,igual,limpar,delete;
    private TextView txtExpressao,  txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        iniciarComponente();
        zero.setOnClickListener(this);
        um.setOnClickListener(this);
        dois.setOnClickListener(this);
        tres.setOnClickListener(this);
        quatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        sete.setOnClickListener(this);
        oito.setOnClickListener(this);
        nove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        divisao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExpressao.setText("");
                txtResultado.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView expressao = findViewById(R.id.txt_expressao);
                String string = expressao.getText().toString();

                if(!string.isEmpty()){
                    byte var0 = 0;
                    int var1 = string.length()-1;
                    String txtExpressao = string.substring(var0,var1);
                    expressao.setText(txtExpressao);
                }
                txtResultado.setText("");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Expression expressao = new ExpressionBuilder(txtExpressao.getText().toString()).build();
                    double Resultado = expressao.evaluate();
                    long longResult = (long) Resultado;
                    if(Resultado == (double) longResult){
                        txtResultado.setText((CharSequence)String.valueOf(longResult));
                    } else{
                        txtResultado.setText((CharSequence) String.valueOf(Resultado));
                    }
                }catch (Exception e ){
                    print();



                }
            }
        });


    }
    public void print(){
        Toast.makeText(this, "Traveco", Toast.LENGTH_LONG).show();
    }
    private void iniciarComponente(){
        zero = findViewById(R.id.numero_zero);
        um = findViewById(R.id.numero_um);
        dois = findViewById(R.id.numero_dois);
        tres = findViewById(R.id.numero_tres);
        quatro = findViewById(R.id.numero_quatro);
        cinco = findViewById(R.id.numero_cinco);
        seis = findViewById(R.id.numero_seis);
        sete = findViewById(R.id.numero_sete);
        oito = findViewById(R.id.numero_oito);
        nove = findViewById(R.id.numero_nove);
        ponto = findViewById(R.id.ponto);
        soma = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.divisao);
        igual = findViewById(R.id.igual);
        limpar = findViewById(R.id.bt_limpar);
        delete = findViewById(R.id.delete);
        txtExpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
    }
    public void acrescentaExpressao(String string, Boolean limpar) {

        if (txtResultado.getText().equals("")) {
            txtExpressao.setText(" ");
        }
        if(limpar){
            txtResultado.setText(" ");
            txtExpressao.append(string);
        } else{
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText(" ");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_zero:
                acrescentaExpressao("0",true);
                break;
            case R.id.numero_um:
                acrescentaExpressao("1",true);
                break;
            case R.id.numero_dois:
                acrescentaExpressao("2",true);
                break;
            case R.id.numero_tres:
                acrescentaExpressao("3",true);
                break;
            case R.id.numero_quatro:
                acrescentaExpressao("4",true);
                break;
            case R.id.numero_cinco:
                acrescentaExpressao("5",true);
                break;
            case R.id.numero_seis:
                acrescentaExpressao("6",true);
                break;
            case R.id.numero_sete:
                acrescentaExpressao("7",true);
                break;
            case R.id.numero_oito:
                acrescentaExpressao("8",true);
                break;
            case R.id.numero_nove:
                acrescentaExpressao("9",true);
                break;
            case R.id.ponto:
                acrescentaExpressao(".",true);
                break;
            case R.id.soma:
                acrescentaExpressao("+",false);
                break;
            case R.id.subtracao:
                acrescentaExpressao("-",false);
                break;
            case R.id.multiplicacao:
                acrescentaExpressao("*",false);
                break;
            case R.id.divisao:
                acrescentaExpressao("/",false);
                break;
        }
    }
}
