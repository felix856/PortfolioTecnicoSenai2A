// Classe principal que cria o aplicativo,opções de escolha de cálculo
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
// Tela onde será realizada as contas de acordo com a opção escolhida 
package com.example.cheveroletgeoespacialprisma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Telacalculo extends AppCompatActivity {

    static int conta;
    EditText et1, et2, et3;
    TextView resposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacalculo);
        getSupportActionBar().hide();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        resposta = findViewById(R.id.resposta);
        OrganizaTela();
    }

    public void OrganizaTela() {
        resposta.setVisibility(View.INVISIBLE);
        if (conta == 1) {
            et1.setHint("Digte a area da base");
            et2.setHint("Digite o numero de lados");
            et3.setHint("Digite a area da face lateral");

        } else if (conta == 2) {
            et1.setHint("Digte a area Total");
            et2.setHint("Digite o numero de lados");
            et3.setHint("Digite o numero de faces");
        } else if (conta == 3) {
            et1.setHint("Digite o volume");
            et2.setHint("Digite a Altura");
            et3.setVisibility(View.INVISIBLE);
        } else if (conta == 4) {
            et1.setHint("Digte a area Total");
            et2.setHint("Digite area da Base");
            et3.setHint("Digite a area da face lateral");
        } else if (conta == 5) {
            et1.setHint("Digte a area total");
            et2.setHint("Digite a area da base");
            et3.setHint("Digite o numero de lados da base");
        } else if (conta == 6) {
            et1.setHint("Digte a area da base");
            et2.setHint("Digite a Altura");
            et3.setVisibility(View.INVISIBLE);
        } else if (conta == 7) {
            et1.setHint("Digte o volume");
            et2.setHint("Digite a Altura");
            et3.setVisibility(View.INVISIBLE);
        }
    }

    public void CalculaVar(View v) {
        double v1 = Double.parseDouble(et1.getText().toString());
        double v2 = Double.parseDouble(et2.getText().toString());
        double v3;

        switch (conta) {
            case 1:
                v3 = Double.parseDouble(et3.getText().toString());
                double conta = 2 * v1 + v2 * v3;
                resposta.setText(conta + "");
            case 2:
                v3 = Double.parseDouble(et3.getText().toString());
                double conta2 = (v1 - v2 * v3) / 2;
                resposta.setText(conta2 + "");

            case 4:
                v3 = Double.parseDouble(et3.getText().toString());
                double conta4 = (v1 - v2) / v3;
                resposta.setText(conta4 + "");
            case 5:
                v3 = Double.parseDouble(et3.getText().toString());
                double conta5 = (v1 - v2) * 2 / (v3);
                resposta.setText(conta5 + "");
            case 3:

                double conta3 = v1 / v2;
                resposta.setText(conta3 + "");
            case 6:

                double conta6 = v1 * v2;
                resposta.setText(conta6 + "");
            case 7:

                double conta7 = (v1 / v2);
                resposta.setText(conta7 + "");
        }


          resposta.setVisibility(View.VISIBLE);
    }
    }
// código XML gerado pela tela principal do aplicativo
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/prismasas"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="15dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="15dp"
        android:text="Qual variável necessita calcular?"
        android:textColor="#E81717"
        android:textColorHighlight="#E32424"
        android:textColorHint="#F12323"
        android:textSize="16sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0" />

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="15dp"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="15dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.0">

        <RadioButton
            android:id="@+id/rbAt"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:hapticFeedbackEnabled="false"
            android:text="Area Total"
            android:textColor="#D50F0F"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbAbpA"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Area da base(Pela área total)"
            android:textColor="#BF0D0D"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbNl"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Numero de lados"
            android:textColor="#D51212"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbAbpv"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Area da base(Pelo volume)"
            android:textColor="#CA1414"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbAf"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Area das faces"
            android:textColor="#B71C1C"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbV"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Volume"
            android:textColor="#C80101"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />

        <RadioButton
            android:id="@+id/rbA"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:backgroundTint="#ED4343"
            android:backgroundTintMode="add"
            android:buttonTint="#99FAE148"
            android:text="Altura"
            android:textColor="#CC1010"
            android:textColorLink="#FFDA18"
            android:textSize="20sp" />
    </RadioGroup>

    <Button
        android:id="@+id/button"
        android:layout_width="308dp"
        android:layout_height="47dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="20dp"
        android:backgroundTint="#FFDA18"
        android:onClick="prosseguir"
        android:text="Prosseguir"
        android:textColor="#0C0C0A"
        android:textColorHint="#6C1313"
        app:iconTint="#FFDA18"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioGroup"
        app:layout_constraintVertical_bias="0.0" />

</androidx.constraintlayout.widget.ConstraintLayout>

//código XML gerado pelos itens da tela de calculo 
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/prismasas"
    tools:context=".Telacalculo">

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="15dp"
        android:layout_marginTop="111dp"
        android:layout_marginEnd="15dp"
        android:backgroundTint="#AE3939"
        android:backgroundTintMode="add"
        android:onClick="CalculaVar"
        android:text="Calcular"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/et3" />

    <TextView
        android:id="@+id/resposta"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="159dp"
        android:layout_marginTop="60dp"
        android:layout_marginEnd="159dp"
        android:text="Resposta"
        android:textColor="#D81111"
        android:textColorHint="#CA1A1A"
        android:textSize="60sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/button2" />

    <EditText
        android:id="@+id/et3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="12dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="12dp"
        android:backgroundTint="#AE3939"
        android:backgroundTintMode="add"
        android:ems="10"
        android:hint="Digite a area da face lateral"
        android:inputType="numberDecimal"
        android:textColor="#CF1313"
        android:textColorHint="#C51A1A"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/et2" />

    <EditText
        android:id="@+id/et1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="12dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="12dp"
        android:backgroundTint="#AE3939"
        android:backgroundTintMode="add"
        android:ems="10"
        android:hint="Digite a area total"
        android:inputType="numberDecimal"
        android:textColor="#BC1010"
        android:textColorHint="#DC2C2C"
        app:layout_constraintBottom_toTopOf="@+id/et2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/et2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="12dp"
        android:layout_marginTop="20dp"
        android:layout_marginEnd="12dp"
        android:backgroundTint="#AE3939"
        android:backgroundTintMode="add"
        android:ems="10"
        android:hint="Digite o numero de lados"
        android:inputType="numberDecimal"
        android:textColor="#D51919"
        android:textColorHint="#BF2727"
        app:layout_constraintBottom_toTopOf="@+id/et3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/et1" />

</androidx.constraintlayout.widget.ConstraintLayout>

