class Carro {

	String marca;
	String modelo;
	int ano;

	void exibirInformacoes() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano );

	}

}

public class Ex03 {


	public static void main(String[] args) {
	    
	    System.out.println("Informacoes do 1 carro:");
		Carro carro = new Carro();
		carro.ano = 2016;
		carro.marca = "Ferrari";
		carro.modelo = "F1";

		carro.exibirInformacoes();
		
        System.out.println("\nInformacoes do 2 carro:");
        Carro carro2 = new Carro();
		carro2.ano = 2015;
		carro2.marca = "BMW";
		carro2.modelo = "I8";

		carro2.exibirInformacoes();
        
        Carro carro3 = new Carro();
        System.out.println("\nInformacoes do 3 carro:");
		carro3.ano = 2020;
		carro3.marca = "Civic";
		carro3.modelo = "G10";

        carro3.exibirInformacoes();
	}

}
