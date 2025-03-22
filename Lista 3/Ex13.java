 class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    protected int codigo; // Atributo protegido

    public Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }
}

 class ProdutoEspecial extends Produto {
    public ProdutoEspecial(String nome, double preco, int quantidade, int codigo) {
        super(nome, preco, quantidade, codigo);
    }

    public void exibirCodigo() {
        System.out.println("Código do produto: " + codigo); // Acesso ao atributo protegido
    }
}

public class Ex13 {
    public static void main(String[] args) {
        ProdutoEspecial produto = new ProdutoEspecial("Caderno", 15.90, 50, 123);
        produto.exibirCodigo(); // Saída: Código do produto: 123
    }
}