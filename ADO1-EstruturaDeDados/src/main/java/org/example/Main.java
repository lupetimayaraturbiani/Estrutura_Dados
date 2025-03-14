package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vetor produtos = new Vetor(5);

        Produto p1 = new Produto("44781", "chocolate", 43);
        Produto p2 = new Produto("55783", "bala de goma", 50);
        Produto p3 = new Produto("52111", "salgadinho", 45);
        Produto p4 = new Produto("22471", "refrigerante", 80);

        try {
            produtos.adiciona(p1);
            produtos.adiciona(p2);
            produtos.adiciona(p3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(produtos);

        //problema que esta adicionanado um produto a mais
        try{
            produtos.adicionaPosicao(1, p4);
        } catch(Exception e){
            e.printStackTrace();
        }


        System.out.println(produtos.tamanho);
    }
}