 import java.util.Scanner;
 
 class Animal {
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método emitirSom
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}

   class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + getNome()); // Acessa o nome via getter
        System.out.println("Idade: " + getIdade() + " anos"); // Acessa a idade via getter
    }

}

 


public class Ex19{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Solicitar informações do usuário
        System.out.print("Digite o nome do cachorro: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cachorro: ");
        int idade = scanner.nextInt();

        // Criar um objeto Cachorro com os dados fornecidos
        Cachorro cachorro = new Cachorro(nome, idade);

        // Exibir informações
        System.out.println("\nInformações do cachorro:");
        cachorro.exibirInfo();
        
        scanner.close();
    }
}