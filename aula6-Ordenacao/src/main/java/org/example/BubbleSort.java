package org.example;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        //criando vetor de números inteiros com 10 posições
        int[] vetor = new int[15];

        //inserindo valores no vetor
        for(int i = 0; i < vetor.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: ");
            vetor[i] = scan.nextInt();
            //vetor[i] = (int) (Math.random() * vetor.length);
            //exibindo os valores do vetor
            System.out.println(vetor[i]);
        }

        //métode de ordenação: Bubble Sort
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        System.out.println("Nosso vetor ordenado:");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

    }
}
