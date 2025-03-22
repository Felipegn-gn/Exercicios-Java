
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 class Produto {
    private String nome;
    private int quantidade;

    // Construtor
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}


 class Estoque {
    private List<Produto> produtos;

    // Construtor
    public Estoque() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para verificar disponibilidade
    public void verificarDisponibilidade(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }
}




public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        // Adicionar produtos ao estoque
        estoque.adicionarProduto(new Produto("Caneta", 100));
        estoque.adicionarProduto(new Produto("Caderno", 50));
        estoque.adicionarProduto(new Produto("Lápis", 200));

        // Verificar disponibilidade
        System.out.print("Digite o nome do produto para verificar disponibilidade: ");
        String nomeProduto = scanner.nextLine();
        estoque.verificarDisponibilidade(nomeProduto);

        scanner.close();
    }
}