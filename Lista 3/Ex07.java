import java.util.Scanner; // Importação da classe Scanner para leitura de dados

// Definindo a classe Carro
class Carro {
    // Atributos da classe (privados)
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Carro
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // Usando o setter para validar o ano
    }

    // Métodos getters e setters para acessar e modificar os atributos privados

    // Getter para marca
    public String getMarca() {
        return marca;
    }

    // Setter para marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para ano
    public int getAno() {
        return ano;
    }

    // Setter para ano com validação
    public void setAno(int ano) {
        if (ano < 1886) {
            System.out.println("Ano inválido, muito antigo. O primeiro carro foi inventado em 1886.");
        } else {
            this.ano = ano;
        }
    }

    // Método para exibir as informações do carro
    void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

// Classe principal que contém o método main
public class Ex07 {
    // Método principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para leitura de dados

        // Solicita ao usuário as informações do carro
        System.out.println("Digite as informações do carro:");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        // Criando um objeto da classe Carro com os dados fornecidos pelo usuário
        Carro carroUsuario = new Carro(marca, modelo, ano);

        // Exibindo as informações do carro criado
        System.out.println("\nInformações do Carro inserido pelo usuário:");
        carroUsuario.exibirInformacoes();

        scanner.close(); // Fechando o Scanner
    }
}