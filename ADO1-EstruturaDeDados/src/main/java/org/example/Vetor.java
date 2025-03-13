package org.example;

import java.util.Arrays;

public class Vetor {
    public Produto[] produtos;
    public int tamanho;

    public Vetor(Produto[] produtos, int tamanho) {
        this.produtos = produtos;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "produtos=" + Arrays.toString(produtos) +
                ", tamanho=" + tamanho +
                '}';
    }

    public void aumentaCapacidade(){
        if(this.tamanho == this.produtos.length){
            Produto[] produtosNovos = new Produto[this.produtos.length * 2];
            for (int i = 0; i < this.produtos.length; i++) {
                produtosNovos[i] = this.produtos[i];
            }
            this.produtos = produtosNovos;
        }
    }

    public void adiciona(String idProduto, String nome, int quantidade) throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.produtos.length){
            produtos[this.tamanho ++] = new Produto(idProduto, nome, quantidade);
        } else {
            throw new Exception("Capacidade máxima de produtos atingida");
        }
    }

    public boolean adicionaPosicao(int posicao, Produto produto) throws Exception{
        this.aumentaCapacidade();
        if(posicao >= 0 && posicao < tamanho){
            for(int i = this.tamanho -1; i>=posicao;i--){
                this.produtos[i + 1] = this.produtos[i];
            }
            this.produtos[posicao] = produto;
            this.tamanho ++;
        }else {
            throw new Exception("Posição inválida");
        }
        return true;
    }

    public Produto busca(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            return this.produtos[posicao];
        } else{
            throw new Exception("Posição inválida");
        }
    }

    public int buscaPorProduto(String idProduto) {
        for(int i = 0; i< tamanho; i ++){
            if(produtos[i].equals(idProduto)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao) throws Exception{
        if (posicao >= 0 && posicao < tamanho) {
            for(int i = posicao; i < this.tamanho - 1; i ++){
                this.produtos[i] = this.produtos[i+1];
            }
            this.produtos[tamanho] = null;
            this.tamanho --;
        } else {
            throw new Exception("Posição inválida");
        }
    }

    public int removePorProduto(String idProduto) throws Exception{
        for (int i = 0; i < tamanho; i++) {
            if(produtos[i].equals(idProduto)){
                this.remove(i);
                return 1;
            }
        }
        return -1;
    }
}
