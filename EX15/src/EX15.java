import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Filme {
    private String titulo;
    private String genero;
    private int ano;

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }
}

public class EX15 {
    public static void main(String[] args) {
        List<Filme> filmes = Arrays.asList(
            new Filme("Os Vingadores", "Ação", 2012),
            new Filme("Guardiões da Galáxia", "Ação", 2014),
            new Filme("O Rei Leão", "Animação", 1994),
            new Filme("Moana", "Animação", 2016),
            new Filme("Deadpool", "Comédia", 2016),
            new Filme("As Branquelas", "Comédia", 2004)
        );

        Map<String, Map<Integer, List<Filme>>> filmesPorGeneroEAno = filmes.stream()
            .collect(Collectors.groupingBy(
                Filme::getGenero,
                Collectors.groupingBy(Filme::getAno)
            ));

        System.out.println("--- Filmes Agrupados por Gênero e Ano ---");
        filmesPorGeneroEAno.forEach((genero, filmesPorAno) -> {
            System.out.println("\nGênero: " + genero);
            filmesPorAno.forEach((ano, listaFilmes) -> {
                System.out.println("  Ano: " + ano);
                listaFilmes.forEach(filme -> System.out.println("    - " + filme.getTitulo()));
            });
        });
    }
}