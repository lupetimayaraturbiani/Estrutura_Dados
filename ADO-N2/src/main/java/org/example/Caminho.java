package org.example;

import java.util.ArrayList;
import java.util.List;

public class Caminho {
    List<String> caminho = new ArrayList<>();
    int distancia = 0;

    public Caminho(String inicio){
        caminho.add(inicio);
    }

    public Caminho(Caminho outro){
        this.caminho = new ArrayList<>(outro.caminho);
        this.distancia = outro.distancia;
    }

    public void adicionar(String no, int peso){
        caminho.add(no);
        distancia += peso;
    }

    public String getUltimoNo(){
        return caminho.get(caminho.size() - 1);
    }

    public String toString(){
        return "Caminho: " + String.join(" -> ", caminho) + " | Distância: " + distancia + "m";
    }
}
