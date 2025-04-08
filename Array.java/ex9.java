import java.util.ArrayList;
import java.util.List;

public class ex9 {
    public static void main(String[] args) {
        List<Character> Caracter = new ArrayList<>();
        Caracter.add('A');
        Caracter.add('E');
        Caracter.add('I');

        System.out.println("Vogais:");
        for(Character caracteres : Caracter) {
            System.out.println(caracteres); 
        }
    }
}