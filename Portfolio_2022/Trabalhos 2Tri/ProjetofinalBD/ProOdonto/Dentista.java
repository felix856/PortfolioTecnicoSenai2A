package com.mycompany.prodonto;
##Trabalho feito em grupo: Maria Eduarda Kuhn Sangaletti e Félix Francisco
public class Dentista {
    int id;
    String nome;
    String cpf;
    int quantidade_pacientes;

    public Dentista(int id, String nome, String cpf, int quantidade_pacientes) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.quantidade_pacientes = quantidade_pacientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQuantidade_pacientes() {
        return quantidade_pacientes;
    }

    public void setQuantidade_pacientes(int quantidade_pacientes) {
        this.quantidade_pacientes = quantidade_pacientes;
    }
    
}
