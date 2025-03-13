package org.example;

import java.util.Arrays;

public class Vetor {
    public Object[] produtos;
    public int tamanho;

    public Vetor(int capacidade) {
        this.produtos = new Object[capacidade];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho; i++) {
            s.append(this.produtos[i]);
            s.append(",");
        }

        if (this.tamanho > 0) {
            s.append(this.produtos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public void aumentaCapacidade(){
        if(this.tamanho == this.produtos.length){
            Object[] produtosNovos = new Object[this.produtos.length * 2];
            for (int i = 0; i < this.produtos.length; i++) {
                produtosNovos[i] = this.produtos[i];
            }
            this.produtos = produtosNovos;
        }
    }

    public void adiciona(Object produto) throws Exception{
        this.aumentaCapacidade();
        this.produtos[this.tamanho] = produtos;
        this.tamanho ++;
    }

    public boolean adicionaPosicao(int posicao, Object produto) throws Exception{
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

    public Object busca(int posicao) throws Exception{
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
