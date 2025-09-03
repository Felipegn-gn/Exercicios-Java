import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Estudante {
    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}

public class EX14 {
    public static void main(String[] args) {
        List<Estudante> estudantes = Arrays.asList(
            new Estudante("Lucas", 8.5),
            new Estudante("Mariana", 9.0),
            new Estudante("João", 7.5),
            new Estudante("Ana", 6.0)
        );

        double media = estudantes.stream()
            .collect(Collectors.averagingDouble(Estudante::getNota));

        System.out.println("A nota média dos estudantes é: " + media);
    }
}