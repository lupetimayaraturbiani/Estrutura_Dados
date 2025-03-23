package org.example;

public class SelectionSort {
    public static void main(String[] args) {
        //criando vetor
        int [] vetor = new int [10];

        //inserindo valores no vetor
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);

            System.out.println(vetor[i]);
        }

        //métodod de ordenação: Selection Sort
        int menorPosicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menorPosicao = i;
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[menorPosicao]) {
                    menorPosicao = j;
                }
            }
            aux = vetor[menorPosicao];
            vetor[menorPosicao] = vetor[i];
            vetor[i] = aux;
        }

        //vetor ordenado
        System.out.println("Nosso vetor ordenado:");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
