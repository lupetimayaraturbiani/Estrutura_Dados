package projeto_revisao_ed;


public class Main {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);

        /*
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
    }
}