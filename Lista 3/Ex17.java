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

    @Override
    public void emitirSom() {
        System.out.println("Latindo!");
    }
}

 class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando!");
    }
}

public class Ex17{
    public static void main(String[] args) {
        Animal animal = new Animal("Animal Genérico", 5);
        animal.emitirSom(); // Saída: O animal está emitindo um som.
        
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mimi", 2);

        cachorro.emitirSom(); // Saída: Latindo!
        gato.emitirSom(); // Saída: Miando!
    }
}