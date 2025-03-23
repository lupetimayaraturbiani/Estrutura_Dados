package org.example;

public class Fila {
    private Paciente[] fila;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;
    private int atendimentoPrioritario;

    public Fila(Paciente[] fila, int capacidade, int inicio, int fim, int tamanho, int atendimentoPrioritario) {
        this.fila = fila;
        this.capacidade = capacidade;
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
        this.atendimentoPrioritario = 0;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == capacidade;
    }

    public void adicionarPaciente(Paciente paciente){
        if(this.estaCheia()){
            System.out.println("A fila está cheia, não é possível adicionar mais pacientes");
            return;
        }
        fim = (fim + 1) % capacidade;
        fila[fim] = paciente;
        tamanho ++;
        System.out.println(paciente.getNome() + " adicionado à fila com sucesso");
    }

    public Paciente proximoPaciente(){
        if(this.estaVazia()){
            System.out.println("Fila vazia.");
            return null;
        }

        if(atendimentoPrioritario < 3){
            for(int i = 0; i < tamanho; i++){
                int indice = (inicio + i) % capacidade;
                if(fila[indice].temPrioridade()){
                    System.out.println("Próximo a ser atendido: " + fila[indice]);
                    return fila[indice];
                }

            }
        }
        System.out.println("Próximo a ser atendido: " + fila[inicio]);
        return fila[inicio];
    }

    public Paciente atenderPaciente(){
        if (this.estaVazia()){
            System.out.println("Fila vazia.");
            return null;
        }

        Paciente pacienteAtendido = proximoPaciente();
        if(pacienteAtendido != null){
            inicio = (inicio + 1) % capacidade;
            tamanho --;

            if (pacienteAtendido.temPrioridade()) {
                atendimentoPrioritario++;
            } else {
                atendimentoPrioritario = 0;
            }

            System.out.println("Atendendo paciente: " + pacienteAtendido);
            return pacienteAtendido;
        }
        return null;
    }

    public void listarPacientes(){
        
    }
}
