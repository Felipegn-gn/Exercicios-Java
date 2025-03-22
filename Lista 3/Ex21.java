 class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

 class Pedido {
    private Cliente cliente;
    private double valorTotal;

    public Pedido(Cliente cliente, double valorTotal) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Valor total: R$" + valorTotal);
    }
}


public class Ex21{
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", "carlos@example.com");
        Pedido pedido = new Pedido(cliente, 150.0);

        pedido.exibirDados();
    
    }
}