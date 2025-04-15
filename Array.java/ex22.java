import java.util.ArrayList;

public class ex22 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Abacaxi");
        
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}