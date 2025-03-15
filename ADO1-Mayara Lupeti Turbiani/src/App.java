import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Vetor produtos = new Vetor(5);
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 6) {
            System.out.println("**********Bem vindo(a)**********");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Buscar produto por id");
            System.out.println("3. Buscar por produto");
            System.out.println("4. Remover produto");
            System.out.println("5. Remover produto por posição");
            System.out.println("6. Sair");
            System.out.println("********************************\n");
            System.out.println("O que deseja fazer?\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\n**Adicionar produto**\n");
                    System.out.println("Digite o ID do produto: ");
                    String id = sc.next();
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.next();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    Produto p1 = new Produto(id, nome, quantidade);
                    produtos.adiciona(p1);
                    System.out.println(produtos);
                    break;
                case 2:
                    System.out.println("\n**Busca de produto por posiçao**\n");
                    System.out.println("Escreva a posição do produto que você procura: ");
                    int pBusca = sc.nextInt();
                    System.out.println(produtos.busca(pBusca));
                    break;
                case 3:
                    System.out.println("\n**Busca de produto**\n");
                    System.out.println("Escreva o ID do produto: ");
                    String idBusca = sc.next();
                    System.out.println(produtos.buscaPorProduto(idBusca));
                    break;
                case 4:
                    System.out.println("\n**Remover produto**\n");
                    System.out.println("Escreva o ID do produto que você deseja excluir: ");
                    String idRemove = sc.next();
                    produtos.removePorProduto(idRemove);
                    System.out.println(produtos);
                    break;
                case 5:
                    System.out.println("\n**Remover produto por posição**\n");
                    System.out.println("Escreva a posição do produto que deseja excluir: ");
                    int pRemove = sc.nextInt();
                    produtos.remove(pRemove);
                    System.out.println(produtos);
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }
}
