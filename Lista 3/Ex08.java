import java.util.Scanner; // ImportaC'C#o da classe Scanner para leitura de dados

// Definindo a classe Pessoa
class Pessoa {
	// Atributos da classe (privados)
	private String nome;
	private float altura;
	private int idade;

	// Construtor da classe Carro
	Pessoa(String nome, float altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}

	// todos getters e setters para acessar e modificar os atributos privados

	// Getter para nome
	public String getNome() {
		return nome;
	}

	// Setter para nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter para altura
	public float getAltura() {
		return altura;
	}

	// Setter para altura
	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Getter para idade
	public int getIdade() {
		return idade;
	}

	// Setter para idade 
	public void setIdade(int idade) {

	this.idade = idade;
	
	}

	// MC)todo para exibir as informacoes do carro
	void exibirInformacoes() {
		System.out.println("Nome: " + nome + ", Altura: " + altura + ", Idade: " + idade);
	}
}

// Classe principal que contemm o metodo main
public class Ex08 {
	// Metodo principal (main)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para leitura de dados

		// Solicita ao usuC!rio as informaC'C5es do carro
		System.out.println("Digite as informacoes do carro:");

		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.print("Altura: ");
		float altura = scanner.nextFloat();

		System.out.print("Idade: ");
		int idade = scanner.nextInt();

		// Criando um objeto da classe pessoa com os dados fornecidos pelo usuario
		Pessoa pessoa= new Pessoa(nome, altura, idade);

		// Exibindo as informaC'C5es do carro criado
		System.out.println("\nInformacoes da pessoa inserido pelo usuario:");
		pessoa.exibirInformacoes();

		scanner.close(); // Fechando o Scanner
	}
}