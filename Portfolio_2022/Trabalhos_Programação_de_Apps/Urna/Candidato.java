package com.example.urna;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Candidato {
    String nome,cargo,numero;
    int qtdvotos;


    public Candidato() {
    }

    public Candidato(String nome, String cargo, String numero) {
        this.nome = nome;
        this.cargo = cargo;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getQtdvotos() {
        return qtdvotos;
    }

    public void setQtdvotos(int qtdvotos) {
        this.qtdvotos = qtdvotos;
    }

    public Candidato(String nome, String cargo, String numero, int qtdvotos) {
        this.nome = nome;
        this.cargo = cargo;
        this.numero = numero;
        this.qtdvotos = qtdvotos;
    }
    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Candidatos").child(nome).setValue(this);
    }
}
