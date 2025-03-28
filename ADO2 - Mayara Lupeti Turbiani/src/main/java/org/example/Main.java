package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila(10);

        int op;
        do {
            System.out.println("*************** Menu ***************");
            System.out.println("1. Solicitar nova senha (Comum)");
            System.out.println("2. Solicitar nova senha (Prioridade)");
            System.out.println("3. Atender próximo paciente");
            System.out.println("4. Listar pacientes na fila");
            System.out.println("5. Visualizar próximo paciente");
            System.out.println("6. Excluir senha");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("****** Solicitar nova senha (Comum) ******");
                    System.out.println("Digite o nome do paciente: ");
                    String nomeComum = sc.nextLine();
                    fila.adicionarPaciente(new Paciente(nomeComum, false));
                    break;
                case 2:
                    System.out.println("**** Solicitar nova senha (Prioridade) ****");
                    System.out.println("Digite o nome do paciente: ");
                    String nomePrioridade = sc.nextLine();
                    fila.adicionarPaciente(new Paciente(nomePrioridade, true));
                    break;
                case 3:
                    System.out.println("******** Atender próximo(a) paciente ********");
                    fila.atenderPaciente();
                    break;
                case 4:
                    System.out.println("******** Listar paciente na fila ********");
                    fila.listarPacientes();
                    break;
                case 5:
                    System.out.println("****** Visualizar próximo(a) paciente ******");
                    Paciente prox = fila.proximoPaciente();
                    if (prox == null) {
                        System.out.println("Não tem nenhum paciente na fila, no momento.");
                    }
                    break;
                case 6:
                    System.out.println("*********** Remover paciente ***********");
                    System.out.println("Digite o nome do paciente que deseja remover: ");
                    String nomeRemover = sc.nextLine();
                    fila.removerPaciente(nomeRemover);
                    break;
                case 7:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

        sc.close();

    }
}