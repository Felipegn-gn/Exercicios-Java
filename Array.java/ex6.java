import java.util.ArrayList;
import java.util.List;

public class ex6 {
    public static void main(String[] args) {
        // Criando a lista e adicionando 5 nomes
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Mariana");
        nomes.add("Pedro");
        nomes.add("Julia");
        
        // Percorrendo com for-each
        System.out.println("Nomes na lista:");
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}