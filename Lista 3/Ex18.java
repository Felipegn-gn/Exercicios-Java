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

        public void tentarAcessarAtributos() {
         System.out.println(nome); // Erro: nome has private access in Animal
         System.out.println(idade); // Erro: idade has private access in Animal
    }
}

 


public class Ex18{
    public static void main(String[] args) {

    }
}