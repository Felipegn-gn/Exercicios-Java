import java.util.ArrayList;

public class ex21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}