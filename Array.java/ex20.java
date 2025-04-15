import java.util.Queue;
import java.util.LinkedList;

public class ex20 {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        clientes.add("Cliente 1");
        clientes.add("Cliente 2");
        clientes.add("Cliente 3");
        clientes.add("Cliente 4");
        clientes.add("Cliente 5");
        
        System.out.println("Clientes na fila:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }
}