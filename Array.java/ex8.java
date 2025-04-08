import java.util.ArrayList;
import java.util.List;

public class ex8 {
    public static void main(String[] args) {
        List<Double> num = new ArrayList<>();
        num.add(1.25);
        num.add(2.50);
        num.add(3.75);

        System.out.println("Números com casas decimais:");
        for(Double numero : num) {
            System.out.printf("%.2f%n", numero); 
        }
    }
}