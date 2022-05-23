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
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#E61313"
    android:backgroundTint="#AC5959"
    tools:context=".MainActivity">

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_marginStart="10dp"
        android:layout_marginTop="27dp"
        android:layout_marginEnd="10dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/mesesano">

        <RadioButton
            android:id="@+id/mensal"
            android:layout_width="239dp"
            android:layout_height="60dp"
            android:text="mensal" />

        <RadioButton
            android:id="@+id/anual"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="anual" />
    </RadioGroup>

    <EditText
        android:id="@+id/mesesano"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginTop="92dp"
        android:layout_marginEnd="10dp"
        android:ems="10"
        android:hint="Digite quantos meses ou ano"
        android:inputType="number"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/dm" />

    <EditText
        android:id="@+id/dm"
        android:layout_width="0dp"
        android:layout_height="44dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="80dp"
        android:layout_marginEnd="20dp"
        android:ems="10"
        android:hint="Digite a quantidade de dias que vc comeu"
        android:inputType="numberDecimal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/p" />

    <EditText
        android:id="@+id/p"
        android:layout_width="wrap_content"
        android:layout_height="51dp"
        android:layout_marginStart="10dp"
        android:layout_marginTop="27dp"
        android:layout_marginEnd="10dp"
        android:ems="10"
        android:hint="Digite o preco da marmita"
        android:inputType="numberDecimal"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/g"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginTop="112dp"
        android:layout_marginEnd="10dp"
        android:textSize="20sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/radioGroup" />

    <Button
        android:id="@+id/calcula"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#D13636"
        android:onClick="calcular"
        android:text="Calcular"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.507"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/g"
        app:layout_constraintVertical_bias="0.509" />

</androidx.constraintlayout.widget.ConstraintLayout>
