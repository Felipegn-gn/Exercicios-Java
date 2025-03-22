 class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    protected int codigo;
    public static int totalProdutos = 0; // Atributo estático

    public Produto(String nome, double preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
        totalProdutos++; // Incrementa o total de produtos
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }
}



public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Total de produtos antes: " + Produto.getTotalProdutos()); // 0

        Produto produto1 = new Produto("Borracha", 0.50, 300, 456);
        Produto produto2 = new Produto("Régua", 5.00, 150, 789);

        System.out.println("Total de produtos depois: " + Produto.getTotalProdutos()); // 2
    
    }
}