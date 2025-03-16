package estruturaestatica;

import java.util.LinkedList;
import java.util.Queue;

public class Teste {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println(fila.toString());

        //esse método recupera, mas não remove, o cabeçalho desta fila ou retorna nulo
        //se a fila estiver vazia, ou seja, nosso método espiar
        System.out.println(fila.peek());

        //remove o elemento da fila ou desinfileira, por conta da classe Queue
        //FIFO - Fist In Last Out (Primeiro a entrar, primeiro a sair)
        System.out.println(fila.remove());

        /* 
        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.espiar());

        if(fila.espiar() == null){
            System.out.println("Ninguém na fila");
        } else {
            System.out.println("O elemento da primeira posição é " + fila.espiar());
        }

        System.out.println(fila.toString);
        System.out.println(fila.desenfileira());
        System.out.println(fila.toString());

        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println("Dados da Pilha: " + pilha);
        System.out.println("Qtde de dados da Pilha: " + pilha.tamanho());
        System.out.println("A pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Qual dado esta no topo: " + pilha.topo());
        
        for(int i=1; i<=10;i++){
            pilha.empilha(i);
        }
        
        System.out.println("Dados da Pilha: " + pilha);
        System.out.println("Qtde de dados da Pilha: " + pilha.tamanho());
        System.out.println("A pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Qual dado esta no topo: " + pilha.topo());
        
        pilha.desempilha();
        
        System.out.println("Dados da Pilha: " + pilha);
        System.out.println("Qtde de dados da Pilha: " + pilha.tamanho());
        System.out.println("A pilha esta vazia? " + pilha.estaVazia());
        System.out.println("Qual dado esta no topo: " + pilha.topo());
        */
        
        
        
    }
 
   
}

