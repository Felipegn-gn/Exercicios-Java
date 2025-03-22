 class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class Ex12{
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50, 100);

        // Tentando acessar atributos privados diretamente (isso causará erro de compilação)
        // System.out.println(produto.nome); // Erro: nome has private access in Produto
        // System.out.println(produto.preco); // Erro: preco has private access in Produto
        // System.out.println(produto.quantidade); // Erro: quantidade has private access in Produto
    }
}