package com.mycompany.prodonto;
##Trabalho feito em grupo:Maria Eduarda Kuhn Sangaletti e Félix Francisco
public class Material {
    int id_material;
    String nome;
    String preco;

    public Material(int id_material, String nome, String preco) {
        this.id_material = id_material;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
}
