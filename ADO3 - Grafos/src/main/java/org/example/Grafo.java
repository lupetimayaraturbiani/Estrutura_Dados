package org.example;
import java.util.*;

public class Grafo {
     private Map<String, List<String>> adjacencias;

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
         //verifica se uma ou ambas cidades ja existem no grafo
         if (!adjacencias.containsKey(cidade1) || !adjacencias.containsKey(cidade2)){
             System.out.println("A cidade(s) não existem");
             return;
         }
         //se as cidades não existirem elas são adicionadas
         adjacencias.get(cidade1).add(cidade2);
         adjacencias.get(cidade2).add(cidade2);
    }

    //metodo que remove cidade/aresta
    public void removeCidade(String cidade){
         //virefica se a cidade existe no grafo
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
    private void dfs(String cidade, Set<String> visitados){
         //primeiro verifica se a cidade ja foi visitada, se sim o metodo termina
         if(!visitados.contains(cidade)){
             //se não foi visitada, ela é impressa
             System.out.println(cidade + " ");
             //e depois é adicionada ao conjunto visitados
             visitados.add(cidade);
             //percorre a lista de cidades vizinhas e chama o metodo dfs
             //de forma recursiva, e assim cada cidade conectada pode ser explorada
             for(String vizinho : adjacencias.get(cidade)){
                 dfs(vizinho, visitados);
             }
         }
    }

    //metodo que busca em profundidade a partir de uma cidade
    public void buscarProfundidade(String origem){
         //declara visitados que servirá para
         //registrar quais cidades ja foram vistas
         Set<String> visitados = new HashSet<>();
         //imprime uma mensagem para informar o
         //inicio da busca antes da execução do dfs
         System.out.println("Buscando profundidade por " + origem + ":");
         //inicia a busca em profundidade a partir da cidade origem
         //o metodo dfs percorre recursivamente todas as conexões
         //até explorar o subgrafo conectado a cidade de origem
         dfs(origem, visitados);
         //imprime uma linha vazia por fins estéticos
         System.out.println();
    }
}
