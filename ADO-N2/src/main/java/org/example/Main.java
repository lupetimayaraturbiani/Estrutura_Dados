package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo grafo = new Grafo();

        // adição das arestas conforme imagem
        grafo.adicionarAresta("A", "B", 300);
        grafo.adicionarAresta("A", "X", 317);
        grafo.adicionarAresta("B", "C", 47);
        grafo.adicionarAresta("C", "D", 62);
        grafo.adicionarAresta("D", "E", 8);
        grafo.adicionarAresta("E", "F", 13);
        grafo.adicionarAresta("C", "H", 141);
        grafo.adicionarAresta("H", "I", 138);
        grafo.adicionarAresta("I", "J", 153);
        grafo.adicionarAresta("J", "K", 512);
        grafo.adicionarAresta("K", "L", 135);
        grafo.adicionarAresta("L", "M", 50);
        grafo.adicionarAresta("L", "N", 187);
        grafo.adicionarAresta("N", "O", 108);
        grafo.adicionarAresta("O", "P", 82);
        grafo.adicionarAresta("P", "Q", 215);
        grafo.adicionarAresta("Q", "R", 97);
        grafo.adicionarAresta("R", "S", 33);
        grafo.adicionarAresta("R", "T", 243);
        grafo.adicionarAresta("S", "T", 207);
        grafo.adicionarAresta("T", "U", 22);
        grafo.adicionarAresta("S", "V", 38);
        grafo.adicionarAresta("U", "V", 210);
        grafo.adicionarAresta("V", "X", 207);
        grafo.adicionarAresta("V", "A", 370);
        grafo.adicionarAresta("U", "X", 107);
        grafo.adicionarAresta("T", "X", 122);
        grafo.adicionarAresta("E", "G", 230);

        // entrada do usuario
        System.out.println("Digite o ponto de origem: ");
        String partida = sc.nextLine().trim().toUpperCase();
        System.out.println("Digite o ponto de destino: ");
        String chegada = sc.nextLine().trim().toUpperCase();

        List<Caminho> caminhos = grafo.acharCaminhoCurto(partida, chegada);

        if(caminhos.isEmpty()) {
            System.out.println("Não consegui achar um caminho entre: " + partida + " e " + chegada);
        } else {
            for (int i = 0; i < caminhos.size(); i++) {
                System.out.println("Opção " + (i + 1) + ": " + caminhos.get(i));
            }
        }
    }
}