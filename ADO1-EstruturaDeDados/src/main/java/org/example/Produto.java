package org.example;

public class Produto {
    public String idProduto;
    public String nome;
    public int quantidade;

    //Constutor
    public Produto(String idProduto, String nome, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    //Getters e Setters
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "Produtos: \nIdProduto:" + idProduto + "\nNome:" + nome + "\nQuantidade:" + quantidade;
    }
}
