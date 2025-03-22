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
        this.ano = ano;
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

    // Setter para ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir as informações do carro
    void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

// Classe principal que contém o método main
public class Ex06 {
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

        // Modificando os atributos usando os setters
        carro1.setMarca("Chevrolet");
        carro1.setModelo("Onix");
        carro1.setAno(2023);

        // Exibindo as informações atualizadas do carro1
        System.out.println("\nInformações atualizadas do Carro 1:");
        carro1.exibirInformacoes();
    }
}