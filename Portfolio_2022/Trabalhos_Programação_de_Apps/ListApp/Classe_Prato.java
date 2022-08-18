package com.example.listapp;

public class Prato {
    String nome;
    String ingredientes;
    float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Prato(String nome, String ingredientes, float preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }
}
