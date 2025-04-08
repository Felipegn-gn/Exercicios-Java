public class ex5 {
    public static void main(String[] args) {
        String palavras[3] = {"Java", "Python", "JavaScript"};
        
        System.out.println("Palavras na ordem inversa:");
        for(int i = palavras.length; i >= 0; i--) {
            System.out.println(palavras[i]);
        }
    }
}