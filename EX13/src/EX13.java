import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Cliente {
    private String nome;
    private boolean ativo;

    public Cliente(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;

    }

    public String getNome() {
        return nome;

    }

    public boolean isAtivo() {
        return ativo;
    }

}

public class EX13 {
    public static void main(String[] args) throws Exception {
        List<Cliente> clientes = Arrays.asList(

                new Cliente("Joao", true),
                new Cliente("Donato", false),
                new Cliente("Luan", true),
                new Cliente("Jonas", false)

        );
        Map<Boolean, List<Cliente>> clientesParticionados = clientes.stream()
                .collect(Collectors.partitioningBy(Cliente::isAtivo));

        // Imprime os clientes ativos
        System.out.println("--- Clientes Ativos ---");
        clientesParticionados.get(true)
                .forEach(cliente -> System.out.println("Nome: " + cliente.getNome() + ", Ativo: " + cliente.isAtivo()));

        System.out.println();

        // Imprime os clientes inativos
        System.out.println("--- Clientes Inativos ---");
        clientesParticionados.get(false)
                .forEach(cliente -> System.out.println("Nome: " + cliente.getNome() + ", Ativo: " + cliente.isAtivo()));
    }
}
