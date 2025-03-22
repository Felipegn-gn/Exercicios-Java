 class Carro {

    String marca;
    String modelo;
    int ano;

    void exibirInformacoes() {
        System.out.println("Informacoes: " + marca + " modelo: " + modelo + " ano: " + ano );


    }

   
}




public class Ex02 {


    public static void main(String[] args) {
      Carro carro = new Carro();
      carro.ano = 2016;
      carro.marca = "Ferrari";
      carro.modelo = "F1";
              
              carro.exibirInformacoes();
    }
    
}
