
package com.mycompany.projeto_temperatura;

import java.util.Scanner;


public class Projeto_Temperatura {

    public static void main(String[] args) {
        double[] temperatura = new double[7];
        double soma, media; 
        int contador, dias_acima, dias_abaixo;
        
        soma = 0;
        Scanner dados = new Scanner(System.in);
        
        for(contador = 0; contador < 7; contador++){
            System.out.println("Digite a " + (contador + 1) + "° temperatura:");
            temperatura[contador] = dados.nextDouble();
            soma = soma + temperatura[contador];
        }
        
        media = soma/7;
        dias_acima= 0;
        dias_abaixo = 0;
        
        for(contador = 0; contador < 7; contador++){
            if(temperatura[contador] > media){
                dias_acima = dias_acima + 1;
            }
            if(temperatura[contador] < media){
                dias_abaixo = dias_abaixo + 1;
            }
        }
        
        System.out.println("A média das temperaturas é " + media);
        System.out.println("A quantidade de dias acima da média é " + dias_acima);
        System.out.println("A quantidade de dias abaixo da média é " + dias_abaixo);
    }
}
