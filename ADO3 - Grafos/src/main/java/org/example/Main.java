package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instaciando a classe Grafo
        Grafo grafo = new Grafo();
        //instanciando a classe Scanner para poder acessar a entrada de dados
        Scanner sc = new Scanner(System.in);
        //variável que vai analisar a opção que o usuário vai escolher
        int op;

        //laço de repetição do menu de opções
        do{
            //imprime as opções de modificações do grafo
            System.out.println("************** Menu Cidades e Estradas **************");
            System.out.println("---------------- 1. Adicionar cidade ----------------");
            System.out.println("--------------- 2. Adicionar estrada ----------------");
            System.out.println("----------------- 3. Remover cidade -----------------");
            System.out.println("---------------- 4. Remover estrada -----------------");
            System.out.println("---------------- 5. Verificar cidade ----------------");
            System.out.println("--------------- 6. Verificar estrada ----------------");
            System.out.println("----------------- 7. Exibir grafo -------------------");
            System.out.println("----------- 8. Buscar profundidade (DFS) ------------");
            System.out.println("********************** 0. Sair **********************");
            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();

            //estrutura que controla o retorno baseado na opção escolhida pelo usuário
            switch (op){
                //caso de adição de cidade
                case 1:
                    System.out.println("---- Adicionar cidade ----");
                    System.out.println("Digite o nome da cidade: ");
                    //aqui o usuário oferece entrada do nome da cidade e ele é definido na variável cidade
                    String cidade = sc.nextLine();
                    //metodo de adição deferido pela instancia de classe grafo sendo passada a variável cidade
                    grafo.adicionaCidade(cidade);
                    break;
                //caso de adição de estrada
                case 2:
                    System.out.println("---- Adicionar estrada ----");
                    //o usuário informa os nomes das duas cidades que formam a estrada
                    System.out.println("Cidade 1: ");
                    String c1 = sc.nextLine();
                    System.out.println("Cidade 2: ");
                    String c2 = sc.nextLine();
                    //as variáveis atribuídas aos nomes das cidades são passadas na
                    //chamada do metodo de adição de estrada
                    grafo.adicionaEstrada(c1, c2);
                    break;
                //caso de remoção de cidade
                case 3:
                    System.out.println("---- Remover cidade ----");
                    System.out.println("Digite a cidade que quer remover: ");
                    //o nome da cidade que o usuário deseja remover é movida para variável cidadeRemovida
                    String cidadeRemovida = sc.nextLine();
                    //a variável cidadeRemovida é passada como parâmetro
                    //do metodo de remoção de cidade
                    grafo.removeCidade(cidadeRemovida);
                    break;
                //caso de remoção de estrada
                case 4:
                    System.out.println("---- Remover estrada ----");
                    //o usuário passa o nome das duas cidades pelas qual a estrada passa
                    System.out.println("Cidade 1: ");
                    String r1 = sc.nextLine();
                    System.out.println("Cidade 2: ");
                    String r2 = sc.nextLine();
                    //os dois nomes de cidade são enviados para variáveis r1 e r2
                    //e essas variáveis são passadas como parâmetro do metodo de remoção de estrada
                    grafo.removeEstrada(r1, r2);
                    break;
                //caso de verificação de cidade
                case 5:
                    System.out.println("---- Verificar cidade ----");
                    System.out.println("Digite a cidade que quer verificar: ");
                    //o usuário insere o nome da cidade que quer verificar no grafo
                    String verCidade = sc.nextLine();
                    //verificação se a cidade que foi inserida existe no grafo
                    if (grafo.existeCidade(verCidade)) {
                        //se sim retornamos a confirmação para o usuário
                        System.out.println("Cidade " + verCidade + " existe no grafo");
                    } else {
                        //se não imprimimos um retorno negativo para o usuário
                        System.out.println("Essa cidade não existe no grafo");
                    }
                    break;
                //caso de verificação de estrada
                case 6:
                    System.out.println("---- Verificar estrada ----");
                    //o usuário entra com o nome das cidades da estrada
                    System.out.println("Cidade 1: ");
                    String v1 = sc.nextLine();
                    System.out.println("Cidade 2: ");
                    String v2 = sc.nextLine();
                    //verificação se a estrada com as cidades informadas existe
                    if (grafo.existeEstrada(v1, v2)) {
                        //se sim é impressa uma mensagem informando a existência da estrada no grafo
                        System.out.println("A estrada existe entre as cidades");
                    } else {
                        //se não imprimimos que a estrada não existe no grafo
                        System.out.println("A estrada não existe entre as cidades");
                    }
                    break;
                //caso de exibição do grafo
                case 7:
                    System.out.println("---- Exibir grafo ----");
                    //chamada do metodo de exibição de grafo chamado pelo grafo instanciado
                    //com as informações que o usuário inseriu
                    grafo.exibirGrafo();
                    break;
                //caso de busca de profundidade por DFS
                case 8:
                    System.out.println("---- Buscar profundidade ----");
                    //o usuário informa a cidade de origem para a busca
                    System.out.println("Digite a cidade de origem para DFS: ");
                    String origem = sc.nextLine();
                    //chamada de metodo de busca de profundidade passando a
                    //variável com a cidade de origem informada pelo usuário
                    grafo.buscarProfundidade(origem);
                    break;
                //caso de saída de loop de menu
                case 0:
                    System.out.println("Encerrando o programa...");
                    //encerra o programa
                    System.exit(0);
                    break;
                //caso de entrada não listada nos casos
                default:
                    //é impresso que a opção é inválida e o usuário continua no loop até digitar 0
                    System.out.println("Opção inválida, tente de novo");
            }
        //condição de encerramento de laço de repetição_
        } while (op != 0);

        sc.close();
    }
}
