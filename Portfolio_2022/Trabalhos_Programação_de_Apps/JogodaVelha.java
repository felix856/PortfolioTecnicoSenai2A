package com.example.viadahavan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b00, b01, b02, b10, b11, b12, b20, b21, b22;
    String ultimo = "O";
    String[][] velha = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
    ImageView vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        vh = findViewById(R.id.vh);
    }

    public void define() {
        if (ultimo.equals("O")) {
            ultimo = "X";
        } else {
            ultimo = "O";
        }
    }

    public void cb00(View v) {
        define();
        velha[0][0] = ultimo;
        b00.setText(ultimo);
        b00.setEnabled(false);
        verificaVencedor();
    }

    public void cb01(View v) {
        define();
        velha[0][1] = ultimo;
        b01.setText(ultimo);
        b01.setEnabled(false);
        verificaVencedor();
    }

    public void cb02(View v) {
        define();
        velha[0][2] = ultimo;
        b02.setText(ultimo);
        b02.setEnabled(false);
        verificaVencedor();
    }

    public void cb10(View v) {
        define();
        velha[1][0] = ultimo;
        b10.setText(ultimo);
        b10.setEnabled(false);
        verificaVencedor();

    }

    public void cb11(View v) {
        define();
        velha[1][1] = ultimo;
        b11.setText(ultimo);
        b11.setEnabled(false);
        verificaVencedor();
    }

    public void cb12(View v) {
        define();
        velha[1][2] = ultimo;
        b12.setText(ultimo);
        b12.setEnabled(false);
        verificaVencedor();
    }

    public void cb20(View v) {
        define();
        velha[2][0] = ultimo;
        b20.setText(ultimo);
        b20.setEnabled(false);
        verificaVencedor();
    }

    public void cb21(View v) {
        define();
        velha[2][1] = ultimo;
        b21.setText(ultimo);
        b21.setEnabled(false);
        verificaVencedor();
    }

    public void cb22(View v) {
        define();
        velha[2][2] = ultimo;
        b22.setText(ultimo);
        b22.setEnabled(false);
        verificaVencedor();
    }
    public void botaoLimpar(View v){
        limpar();
    }

    public void limpar() {
        ultimo = "O";
        b00.setText("");
        b00.setEnabled(true);
        velha[0][0] = "a";

        b01.setText("");
        b01.setEnabled(true);
        velha[0][1] = "b";

        b02.setText("");
        b02.setEnabled(true);
        velha[0][2] = "c";

        b10.setText("");
        b10.setEnabled(true);
        velha[1][0] = "d";

        b11.setText("");
        b11.setEnabled(true);
        velha[1][1] = "e";

        b12.setText("");
        b12.setEnabled(true);
        velha[1][2] = "f";

        b20.setText("");
        b20.setEnabled(true);
        velha[2][0] = "g";

        b21.setText("");
        b21.setEnabled(true);
        velha[2][1] = "h";
        b22.setText("");
        b22.setEnabled(true);
        velha[2][2] = "i";


    }



    public void verificaVencedor() {
                trio(velha[0][0], velha[0][1], velha[0][2]);
                trio (velha[1][0], velha[1][1], velha[1][2]);
                trio(velha[2][0], velha[2][1], velha[2][2]);
                trio(velha[0][0], velha[1][0], velha[2][0]);
                trio(velha[0][1], velha[1][1], velha[2][1]);
                trio(velha[0][2], velha[1][2], velha[2][2]);
                trio(velha[0][0],velha[1][1],velha[2][2]);
                trio(velha[0][2],velha[1][1],velha[2][0]);



    }

    public void trio(String s1, String s2, String s3) {
        if (s1.equals(s2) && s2.equals(s3)) {
            Toast.makeText(this, s2 + " venceu!", Toast.LENGTH_LONG).show();


        }

    }
}


