package org.example;

public class Fila {
    private Paciente[] fila;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;
    private int atendimentoPrioritario;

    public Fila(int capacidade) {
        this.fila = new Paciente[capacidade];
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
                    System.out.println("Próximo a ser atendido: \n" + fila[indice]);
                    return fila[indice];
                }

            }
        }
        System.out.println("Próximo a ser atendido(a): \n" + fila[inicio]);
        return fila[inicio];
    }

    public Paciente atenderPaciente(){
        if (this.estaVazia()){
            System.out.println("Fila vazia.");
            return null;
        }

        Paciente pacienteAtendido = proximoPaciente();
        if(pacienteAtendido != null){
            removerPaciente(pacienteAtendido.getNome());

            if (pacienteAtendido.temPrioridade()) {
                atendimentoPrioritario++;
            } else {
                atendimentoPrioritario = 0;
            }

            System.out.println("Paciente " + pacienteAtendido.getNome() + " atendido(a) com sucesso!");
            return pacienteAtendido;
        }
        return null;
    }

    public void listarPacientes(){
        if(estaVazia()){
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Pacientes na fila: ");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            System.out.println((i + 1) + ". " + "\n" + fila[indice]);
        }
    }

    public void removerPaciente(String nome){
        if (this.estaVazia()){
            System.out.println("Fila vazia.");
            return;
        }

        int indiceRemover = -1;
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            if(fila[indice].getNome().equalsIgnoreCase(nome)){
                indiceRemover = indice;
                break;
            }
        }

        if (indiceRemover == -1){
            System.out.println("Paciente com o nome " + nome + " não existe na fila");
            return;
        }

        if (indiceRemover == inicio){
            inicio = (inicio + 1) % capacidade;
        } else if (indiceRemover == fim) {
            fim = (fim - 1 + capacidade) % capacidade;
        } else {
            int atual = indiceRemover;
            int prox = (atual + 1) % capacidade;
            while(atual != fim) {
                fila[atual] = fila[prox];
                atual = prox;
                prox = (atual + 1) % capacidade;
            }
            fila[fim] = null;
            fim = (fim - 1 + capacidade) % capacidade;
        }
        tamanho --;
        System.out.println("Paciente " + nome + " removido com sucesso da fila!");
    }
}
