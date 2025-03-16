package estruturaestatica;

import java.util.Stack;

public class TesteStack {
     public static void main(String[] args){
         Stack<Integer> stack = new Stack<Integer>();
         
         //método que verifica se a pilha está vazia
         System.out.println(stack.isEmpty());
         
         // método para empilhar
         for (int i=1; i<=15; i++) {
           stack.push(i);
       }
         
         // método para verificar o tamanho da pilha
         System.out.println("Tamanho da nossa Pilha: " + stack.size());
         
     }
    
}
