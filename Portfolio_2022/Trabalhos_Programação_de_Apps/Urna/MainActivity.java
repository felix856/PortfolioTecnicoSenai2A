package com.example.urna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText cpf, numerocandidato;
    TextView nome, cargo;
    Candidato c;
    String cpfVerificado = "";
    boolean aux = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        cpf = findViewById(R.id.cpfEleitor);
        numerocandidato = findViewById(R.id.numCandidato);
        nome = findViewById(R.id.Nome);
        cargo = findViewById(R.id.cargo);


    }


    public void confirma(View view) {
        Eleitor eleitor = new Eleitor(cpf.getText().toString());
        baixaCPF();

        String mensagem = "Você já votou!";
        //Toast.makeText(this, cpfVerificado, Toast.LENGTH_SHORT).show();
        if (!cpfVerificado.equals(eleitor.getCpf())) {
            eleitor.salvar();
            c.setQtdvotos(c.getQtdvotos() + 1);
            c.salvar();
            mensagem = "Você votou!";
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

    public void print(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }

    //database
    public void verificaCandidato(View view) {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Candidatos");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()) {
                    Candidato ca = d.getValue(Candidato.class);

                    if (ca.getNumero().equals(numerocandidato.getText().toString())) {
                        c = ca;
                        aux = true;
                        nome.setText(ca.getNome());
                        cargo.setText(ca.getCargo());
                        break;

                    }
                }
                if (aux == false) {
                    print("Candidato não existe");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }


    public void baixaCPF() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Eleitores");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot d : snapshot.getChildren()) {
                    String eleitorCpf = d.getValue(Eleitor.class).getCpf();
                    if(eleitorCpf.equals(cpf.getText().toString())){
                        cpfVerificado = eleitorCpf;
                        break;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}


