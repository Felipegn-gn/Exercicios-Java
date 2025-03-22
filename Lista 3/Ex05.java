// Definindo a classe Carro
    class Carro {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe Carro
     Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir as informações do carro
     void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}
  public class Ex05{
    // Método principal (main)
    public static void main(String[] args) {
        // Criando objetos da classe Carro usando o construtor
        Carro carro1 = new Carro("Toyota", "Corolla", 2022);
        Carro carro2 = new Carro("Ford", "Mustang", 2021);
        Carro carro3 = new Carro("Honda", "Civic", 2023);

        // Exibindo as informações de cada carro
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();

        System.out.println("\nInformações do Carro 3:");
        carro3.exibirInformacoes();
    }
}