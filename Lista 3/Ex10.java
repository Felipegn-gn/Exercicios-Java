import java.util.Scanner;

 class ContaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para obter o titular da conta
    public String getTitular() {
        return titular;
    }
} 
    public class Ex10{

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma conta bancária
        ContaBancaria conta = new ContaBancaria("João Silva", 1000);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        // Solicitar valor para depósito
        System.out.print("Digite o valor que deseja depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        // Solicitar valor para saque
        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        scanner.close(); // Fechar o scanner
    }
}