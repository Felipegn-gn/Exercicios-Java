import java.util.Scanner;

 class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos públicos para manipular o estoque

    // Adicionar quantidade ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade deve ser positiva.");
        }
    }

    // Remover quantidade do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    // Exibir informações do produto
    public void exibirInfo() {
        System.out.println("\nInformações do produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
} 
    public class Ex11{
    // Método principal para interação com o usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do produto ao usuário
        System.out.println("Cadastro de Produto");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidadeInicial = scanner.nextInt();

        // Criando o produto com as informações fornecidas
        Produto produto = new Produto(nome, preco, quantidadeInicial);

        // Exibindo informações iniciais
        produto.exibirInfo();

        // Loop para interação contínua com o usuário
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar ao estoque");
            System.out.println("2 - Remover do estoque");
            System.out.println("3 - Ver informações do produto");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade que deseja adicionar ao estoque: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    produto.adicionarEstoque(quantidadeAdicionar);
                    break;

                case 2:
                    System.out.print("Digite a quantidade que deseja remover do estoque: ");
                    int quantidadeRemover = scanner.nextInt();
                    produto.removerEstoque(quantidadeRemover);
                    break;

                case 3:
                    produto.exibirInfo();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}