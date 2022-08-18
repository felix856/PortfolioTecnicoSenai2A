package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nomePrato, ingredientes, preco;
    ArrayList<Prato> cardapio = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nomePrato = findViewById(R.id.nomePrato);
        ingredientes = findViewById(R.id.ingredientes);
        preco = findViewById(R.id.preco);
    }
        public void cadastra (View a){
           String nomePratos = nomePrato.getText().toString();
           String ingredientesPrato= ingredientes.getText().toString();
           float precoprato = Float.parseFloat(preco.getText().toString());
           Prato p = new Prato(nomePratos,ingredientesPrato,precoprato);
            cardapio.add(p);
        }
        public void listar(View g){
        Intent i = new Intent(this,TelaCardapio.class);
        startActivity(i);
        TelaCardapio.cardapio= this.cardapio ;
        }
    }
