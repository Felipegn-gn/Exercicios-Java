import java.util.Queue;
import java.util.LinkedList;

public class ex19 {
    public static void main(String[] args) {
        Queue<Double> decimais = new LinkedList<>();
        decimais.add(3.14);
        decimais.add(2.718);
        decimais.add(1.618);
        decimais.add(9.81);
        
        for (Double valor : decimais) {
            System.out.println(valor);
        }
    }
}