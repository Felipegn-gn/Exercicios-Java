public class ex1 {
    public static void main(String[] args) {
        // Cria e já inicializa o array com valores
        int[] numeros = {10, 25, 42, 7, 15};
        
        // Exibe os valores usando for melhorado (for-each)
        System.out.println("Valores do array:");
        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}