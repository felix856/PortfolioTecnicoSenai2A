package com.mycompany.prodonto;
##Trabalho feito em grupo: Maria Eduarda Kuhn Sangaletti e Félix Francisco
public class Cliente {
    int id_Cliente;
    String nome_cli;
    String cpf_cli;
    String hora_marcada;

    public Cliente(int id_Cliente, String nome_cli, String cpf_cli, String hora_marcada) {
        this.id_Cliente = id_Cliente;
        this.nome_cli = nome_cli;
        this.cpf_cli = cpf_cli;
        this.hora_marcada = hora_marcada;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getHora_marcada() {
        return hora_marcada;
    }

    public void setHora_marcada(String hora_marcada) {
        this.hora_marcada = hora_marcada;
    }
    
}
