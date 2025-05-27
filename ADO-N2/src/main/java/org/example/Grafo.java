package org.example;

import java.util.*;

public class Grafo {
    private Map<String, List<Aresta>> adjacencias = new HashMap<>();

    public void adicionarAresta(String origem, String destino, int peso){
        adjacencias.putIfAbsent(origem, new ArrayList<>());
        adjacencias.putIfAbsent(destino, new ArrayList<>());
        adjacencias.get(origem).add(new Aresta(destino, peso));
        adjacencias.get(destino).add(new Aresta(origem, peso));
    }

    public List<Caminho> acharCaminhoCurto(String inicio, String fim){
        PriorityQueue<Caminho> fila = new PriorityQueue<>(Comparator.comparingInt(c -> c.distancia));
        List<Caminho> melhoresCaminhos = new ArrayList<>();
        Set<String> visitados = new HashSet<>();

        fila.add(new Caminho(inicio));

        while (!fila.isEmpty() && melhoresCaminhos.size() < 2){
            Caminho atual = fila.poll();
            String ultimo = atual.getUltimoNo();

            if (visitados.contains(ultimo + atual.caminho)) continue;

            if (ultimo.equals(fim)) {
                melhoresCaminhos.add(atual);
                continue;
            }

            for (Aresta aresta : adjacencias.getOrDefault(ultimo, Collections.emptyList())) {
                if (!atual.caminho.contains(aresta.destino)){
                    Caminho novoCaminho = new Caminho(atual);
                    novoCaminho.adicionar(aresta.destino, aresta.peso);
                    fila.add(novoCaminho);
                }
            }

            visitados.add(ultimo + atual.caminho);
        }

        return melhoresCaminhos;
    }
}
