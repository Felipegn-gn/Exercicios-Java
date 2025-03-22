 class Animal {
    // Atributos privados
    private String nome;
    private int idade;

 

    // Construtor para inicializar nome e idade
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos get e set para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para o atributo idade
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


public class Ex16 {
    public static void main(String[] args) {
        // Criando um objeto da classe Animal
        Animal animal = new Animal("Leão", 5);

        // Usando os métodos get e set
        System.out.println("Nome do animal: " + animal.getNome());
        System.out.println("Idade do animal: " + animal.getIdade());

       

        // Chamando o método emitirSom
        animal.emitirSom();
    }
}
