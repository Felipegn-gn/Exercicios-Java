 import java.util.Scanner;
 
 class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}



public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Criar objeto Aluno
        Aluno aluno = new Aluno(nome, matricula, nota1, nota2);

        // Exibir média
        System.out.println("\nMédia do aluno " + aluno.getNome() + ": " + aluno.calcularMedia());

        scanner.close();
    }
}