import java.util.Queue;
import java.util.LinkedList;

public class ex17
{
    public static void main(String[] args) {
        Queue<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(42);
        
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}