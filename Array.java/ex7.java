import java.util.ArrayList;

public class ex7 {
    public static void main(String[] args) {
        // Criando a lista e adicionando 5 nomes
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        
        // Percorrendo com for-each
        System.out.println("Multiplo de 2:");
        for(int numero : num) {
            System.out.println(numero * 2);
        }
    }
}