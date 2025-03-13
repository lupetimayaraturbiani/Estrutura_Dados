package projeto_revisao_ed;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        
        /*
        // AULA 1 //
        Vetor vetor = new Vetor(5);
        vetor.adiciona("teste 1");
        vetor.adiciona("teste 2");
        //vetor.adiciona("teste 3");
        //vetor.adiciona("teste 4");
        //vetor.adiciona("teste 5");
        //vetor.adiciona("teste 6");
        

        System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());
        System.out.println("Informação na posição 1: " + vetor.busca(1));
        System.out.println("Buscar o endereço da informação Elemento 1: " + vetor.buscaPorElemento("teste 2"));
        
        System.out.println("\n\n\n\n");

        vetor.adicionaInicio(0, "teste 0");
        System.out.println("A quantidade de informações no vetor é " + vetor.tamanho);
        System.out.println("Dados do vetor: " + vetor.toString());
        System.out.println("Informações na posição 1: " + vetor.busca(1));

        System.out.println("\n\n\n\n");
        */


        /*
        // AULA 2 //
        vetor.adiciona("Elemento 0");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");
        

        System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
        System.out.println("Dados de vetor: " + vetor.toString());

        System.out.println("\n\n");
        vetor.remove(3);

        System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
        System.out.println("Dados de vetor: " + vetor.toString());

        System.out.println("\n\n");
        vetor.removeByElement("Elemento 5");

        System.out.println("A quantidade de informações no vetor é: " + vetor.tamanho());
        System.out.println("Dados de vetor: " + vetor.toString());
        */

        VetorObjeto vetor = new VetorObjeto(5);

        Contato c1 = new Contato("Gustavo", "91552-2004", "gustavo@gmail.com");
        Contato c2 = new Contato("Coraline", "98745-1003", "coraline@gmail.com");
        Contato c3 = new Contato("Maria Eduarda", "986624-3369", "duarda@gmail.com");

        try {
            vetor.adiciona(c1);
            vetor.adiciona(c2);
            vetor.adiciona(c3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Tamanho do vetor: " + vetor.tamanho);
        System.out.println(vetor.toString());

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Elemento A");
        arrayList.add("Elemento C");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento B");

        System.out.println(arrayList);

        //método de busca que retorna true  ou false
        boolean existe = arrayList.contains("Elemento C");
        if(existe){
            System.out.println("Elemento encontrados no vetor");
        } else{
            System.out.println("Elemento não existe no vetor");
        }

        //método de busca que retorna a posição
        int posicao = arrayList.indexOf("Elemento C");
        if(posicao > -1){
            System.out.println("Elemento encontrado na posição n° " + posicao);
        }  else {
            System.out.println("Elemento não existe no vetor");
        }

        //método de busca por posição que retorna o elemento
        System.out.println(arrayList.get(1));

        //método de deletar elemento de vetor, aceita tanto a posiçaõ quanto o elemento
        arrayList.remove(0);
        arrayList.remove("Elemento C");

        //método que retorna o tamanho da array
        System.out.println("Tamanho do vetor: " + arrayList.size());

        
    }
}