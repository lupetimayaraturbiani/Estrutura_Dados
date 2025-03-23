package org.example;

public class Paciente {
    private String nome;
    private boolean prioridade;

    public Paciente(String nome, boolean prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
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
        return "Nome: " + nome + (prioridade ? " (Prioridade)" : "");
    }
}
