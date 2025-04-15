import java.util.Queue;
import java.util.LinkedList;

public class ex18 {
    public static void main(String[] args) {
        Queue<Character> letras = new LinkedList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        
        for (Character letra : letras) {
            System.out.println(letra);
        }
    }
}