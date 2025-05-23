package org.example;
import java.util.*;

public class Grafo {
     private Map<String, List<String>> adjacencias;
     private int profundidadeMax;

     public Grafo(){
         adjacencias = new HashMap<>();
     }

     //metodo que adiciona uma cidade (vértice)
    public void adicionaCidade(String cidade){
         //esse metodo da interface map associa a chave especificada ao valor especificado
         //se, e somente se, a chave ainda não estiver associada a um valor ou a um null
         adjacencias.putIfAbsent(cidade, new ArrayList<>());
    }

    //metodo que adiciona uma estrada (aresta não-direcionada)
    public void adicionaEstrada(String cidade1, String cidade2){
         //verifica se uma ou ambas cidades não existem no grafo
         if (!adjacencias.containsKey(cidade1) || !adjacencias.containsKey(cidade2)){
             System.out.println("A cidade(s) não existem");
             return;
         }
         //se as cidades existirem elas são adicionadas a uma estrada
         adjacencias.get(cidade1).add(cidade2);
         adjacencias.get(cidade2).add(cidade2);
    }

    //metodo que remove cidade/aresta
    public void removeCidade(String cidade){
         //verifica se a cidade existe no grafo
         if (!adjacencias.containsKey(cidade)){
             //se não existir, não tem o que remover então o metodo termina aqui
            return;
         }

         //percorre todas as conexões(arestas)
         for (String vizinho : adjacencias.get(cidade)){
             //para cada vizinho da cidade que vai ser removida,
             //acessa a lista de adjacencias do vizinho e remove a cidade
             adjacencias.get(vizinho).remove(cidade);
         }

         //remove a propria cidade do mapa de adjacencias
         adjacencias.remove(cidade);
    }

    //metodo que remove uma estrada(aresta não-direcionada)
    public void removeEstrada(String cidade1, String cidade2){
         //verifica se cidade1 existe como nó no grafo
         if(adjacencias.containsKey(cidade1)){
             //se sim acessa a lista de adjacencias de cidade1
             //e remove cidade2 dessa lista
             adjacencias.get(cidade1).remove(cidade2);
         }

         //verifica se cidade2 existe como nó no grafo
         if(adjacencias.containsKey(cidade2)){
             //se sim acessa a lista de adjacencias de cidade2
             //e remove cidade1 dessa lista
             adjacencias.get(cidade2).remove(cidade1);
         }
    }

    //metodo que verifica se uma cidade existe
    public boolean existeCidade(String cidade){
         //se a cidade existir retorna true
         //se não retorna false
         return adjacencias.containsKey(cidade);
    }

    //metodo que verifica se existe uma estrada entre duas cidades
    public boolean existeEstrada(String cidade1, String cidade2){
         //verifica se a cidade1 existe no grafo e depois
         return adjacencias.containsKey(cidade1) &&
                 //verifica se cidade2 está na lista de cidade conectadas a cidade1
                 adjacencias.get(cidade1).contains(cidade2);
         //se as duas verificações forem verdadeiras o metodo retorna true
         //se não retorna false
    }

    //metodo que exibe o grafo
    public void exibirGrafo(){
         //percorre todas as chaves do mapa adjacencias
         for(String cidade : adjacencias.keySet()){
             //para cada cidade ele imprime seu nome e depois -> e a lista
             //de cidades conectadas à ela
             System.out.println(cidade + " -> " + adjacencias.get(cidade));
         }
    }

    //metodo que busca em profundidade (dfs : depth-first-search)
    private void dfs(String atual, Set<String> visitados, int nivel) {
        //marca o vértice atual como visitado
        visitados.add(atual);

        //imprime o nome do vértice, indentado conforme a profundidade (opcional, apenas visual)
        System.out.println(" ".repeat(nivel * 2) + atual);

        //atualiza a profundidade máxima, se a profundidade atual for maior
        if (nivel > profundidadeMax) {
            profundidadeMax = nivel;
        }

        //para cada vizinho do vértice atual (se houver)
        // percorre todos os vizinhos do vértice atual
        // se não houver vizinhos, usa uma lista vazia como padrão
        for (String vizinho : adjacencias.getOrDefault(atual, new ArrayList<>())) {
            // verifica se o vizinho ainda não foi visitado
            // se não foi, chama recursivamente o dfs para esse vizinho
            if (!visitados.contains(vizinho)) {
                dfs(vizinho, visitados, nivel + 1);
            }
        }
    }


    //metodo que busca em profundidade a partir de uma cidade
    public void buscarProfundidade(String origem) {
        //cria um conjunto para registrar os vértices já visitados
        Set<String> visitados = new HashSet<>();

        //zera a profundidade máxima antes de iniciar uma nova busca
        profundidadeMax = 0;

        //exibe uma mensagem informando o início da busca
        System.out.println("Buscando profundidade por " + origem + ":");

        //inicia a busca em profundidade a partir do vértice de origem, no nível 0
        dfs(origem, visitados, 0);

        //imprime a profundidade máxima alcançada após a busca
        System.out.println("\nProfundidade máxima: " + profundidadeMax);
    }

}
