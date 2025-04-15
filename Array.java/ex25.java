import java.util.ArrayList;

public class ex25 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        System.out.println("Números ímpares de 1 a 10:");
        for (Integer num : numeros) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        

    }
}