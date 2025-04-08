public class ex2
 {
    public static void main(String[] args) {
        // Declara e inicializa o array em uma linha
        double[] valores = {3.14, 2.71828, 1.61803, 9.80665};
        
        // Imprime usando for-each
        System.out.println("Valores armazenados:");
        for(double valor : valores) {
            System.out.println(valor);
        }
    }
}