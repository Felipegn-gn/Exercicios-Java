 class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

 class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getSalarioTotal() {
        return getSalarioBase() + bonus;
    }
}

class Programador extends Funcionario {
    private int horasExtras;

    public Programador(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    public double getSalarioTotal() {
        return getSalarioBase() + (horasExtras * 50); // R$50 por hora extra
    }
}

public class Ex20{
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 5000, 1000);
        Programador programador = new Programador("Maria", 3000, 10);

        System.out.println("Salário total do gerente: " + gerente.getSalarioTotal()); // 6000.0
        System.out.println("Salário total do programador: " + programador.getSalarioTotal()); // 3500.0
        
    
    }
}