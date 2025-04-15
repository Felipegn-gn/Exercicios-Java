import java.util.Queue;
import java.util.LinkedList;

public class ex16 {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Beatriz");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}