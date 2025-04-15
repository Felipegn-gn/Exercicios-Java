import java.util.ArrayList;

public class ex24 {
    public static void main(String[] args) {
        ArrayList<Character> consoantes = new ArrayList<>();
        consoantes.add('B');
        consoantes.add('C');
        consoantes.add('D');
        consoantes.add('F');
        consoantes.add('G');
        consoantes.add('H');
        consoantes.add('J');
        consoantes.add('K');
        consoantes.add('L');
        consoantes.add('M');
        consoantes.add('N');
        consoantes.add('P');
        consoantes.add('Q');
        consoantes.add('R');
        consoantes.add('S');
        consoantes.add('T');
        consoantes.add('V');
        consoantes.add('W');
        consoantes.add('X');
        consoantes.add('Y');
        consoantes.add('Z');
        
        System.out.println("Consoantes do alfabeto:");
        for (Character consoante : consoantes) {
            System.out.print(consoante + " ");
        }
    }
}