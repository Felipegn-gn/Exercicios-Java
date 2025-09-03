import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Classe Pedido com id e valor
class Pedido {
    private int id;
    private double valor;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }


}

public class EX11 {
    public static void main(String[] args) {
        // Criando uma lista de pedidos
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, 100.0),
                new Pedido(2, 250.5),
                new Pedido(1, 75.0),
                new Pedido(3, 300.0),
                new Pedido(2, 50.0),
                new Pedido(1, 120.5)
        );

        // Agrupando os pedidos por ID e somando os valores de cada grupo
        Map<Integer, Double> totalPorId = pedidos.stream()
                .collect(Collectors.groupingBy(
                        Pedido::getId,
                        Collectors.summingDouble(Pedido::getValor)
                ));

        // Imprimindo o resultado
        System.out.println("Total de valores por ID de pedido:");
        totalPorId.forEach((id, total) ->
                System.out.printf("ID do Pedido: %d, Valor Total: %.2f%n", id, total)
        );
    }
}

