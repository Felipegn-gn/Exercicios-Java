import java.util.ArrayList;

public class ex23 {
    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(15.5);
        valores.add(22.3);
        valores.add(10.0);
        valores.add(7.2);
        
        double soma = 0;
        for (Double valor : valores) {
            soma += valor;
        }
        
        System.out.println("Soma total: " + soma);
    }
}