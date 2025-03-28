package org.example;

import java.util.Random;

public class Paciente {
    //talvez adicionar um número de senha randômico que será chamadi quando for o próximo
    private String nome;
    private boolean prioridade;
    private int senha;

    public Paciente(String nome, boolean prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.senha = gerarSenha();
    }

    private int gerarSenha() {
        Random r = new Random();
        return r.nextInt(900) + 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean temPrioridade() {
        return prioridade;
    }

    public void setPrioridade(boolean prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Senha: " + senha + "\nNome: " + nome + (prioridade ? " (Prioridade)" : "");
    }
}
