import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// Classe simples para representar uma pessoa
class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

// Classe que resume a pessoa
class ResumoPessoa {
    String nomeCompleto;
    String faixaEtaria;

    public ResumoPessoa(String nomeCompleto, String faixaEtaria) {
        this.nomeCompleto = nomeCompleto;
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + ", Faixa Etaria: " + faixaEtaria;
    }
}


public class EX12 {

    public static String obterFaixaEtaria(int idade) {
        if (idade <= 12) return "Crianca";
        if (idade <= 18) return "Adolescente";
        if (idade <= 59) return "Adulto";
        return "Idoso";
    }

    public static void main(String[] args) {
        // 1. Lista de pessoas
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Joao Silva", 28),
                new Pessoa("Maria Souza", 60),
                new Pessoa("Pedro Santos", 19)
        );

        // 2. Mapeia a lista de Pessoas para uma lista de ResumoPessoas
        List<ResumoPessoa> resumoPessoas = pessoas.stream()
                .map(p -> new ResumoPessoa(p.nome, obterFaixaEtaria(p.idade)))
                .collect(Collectors.toList());

        // 3. Imprime o resultado
        resumoPessoas.forEach(System.out::println);
    }
}

