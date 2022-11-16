package com.example.urna;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Eleitor {
    private String cpf;


    public Eleitor() {
    }

    public Eleitor(String cpf) {
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

       public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Eleitores").child(cpf).setValue(this);
    }
}
