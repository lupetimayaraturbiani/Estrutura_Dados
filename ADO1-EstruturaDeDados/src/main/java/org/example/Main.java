package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vetor produtos = new Vetor(5);

        Produto p1 = new Produto("44781", "chocolate", 43);
        Produto p2 = new Produto("55783", "bala de goma", 50);
        Produto p3 = new Produto("52111", "salgadinho", 45);

        try {
            produtos.adiciona(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}