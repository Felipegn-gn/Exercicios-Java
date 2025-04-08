public class ex4
 {
    public static void main(String[] args) {
        // Declara e inicializa o array em uma linha
        int[] num = {1, 10, 4, 6, 5, 8 };
        
        // Imprime usando for-each
        System.out.println("numero pares:");
        for(int numero : num) {
            if(numero % 2 == 0)
            System.out.println(numero);
            
        }
    }
}


