// Importações
import java.util.ArrayList;
import java.util.Scanner;

// Declaração da classe principal
public class GerenciadorDeProdutos {

    // Método principal (main)
    public static void main(String[] args) {
    // Cria um ArrayList para armazenar os objetos Produto
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcao = -1;

    while (opcao != 0) {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Listar todos os produtos");
        System.out.println("3. Buscar produto por código");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        switch (opcao) {
            case 1:
                adicionarProduto(listaDeProdutos, scanner);
                break;
            case 2:
                listarProdutos(listaDeProdutos);
                break;
            case 3:
                buscarProduto(listaDeProdutos, scanner);
                break;
            case 0:
                System.out.println("Saindo do programa. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    scanner.close(); // Fechar o scanner é uma boa prática
}

    // Método para adicionar um produto
    private static void adicionarProduto(ArrayList<Produto> lista, Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        Produto novoProduto = new Produto(nome, preco, codigo);
        lista.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    // Método para listar todos os produtos
    private static void listarProdutos(ArrayList<Produto> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }

    // Método para buscar um produto por código
    private static void buscarProduto(ArrayList<Produto> lista, Scanner scanner) {
        System.out.print("Digite o código do produto que deseja buscar: ");
        int codigoBusca = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        for (Produto produto : lista) {
            if (produto.getCodigo() == codigoBusca) {
                System.out.println("Produto encontrado: " + produto);
                return;
            }
        }
        System.out.println("Produto com código " + codigoBusca + " não encontrado.");
    }
}