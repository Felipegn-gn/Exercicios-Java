import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Carro {
    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

public class EX10 {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Fusca", 1970));
        carros.add(new Carro("Gol", 2005));
        carros.add(new Carro("Civic", 2020));

        // Usa a Stream API para mapear cada objeto Carro para seu ano de fabricação.
        List<Integer> anosDeFabricacao = carros.stream()
                .map(Carro::getAno) // Extrai o ano de cada carro
                .collect(Collectors.toList()); // Coleta os anos em uma nova lista

        System.out.println("Anos de fabricação dos carros: " + anosDeFabricacao);
    }
}

