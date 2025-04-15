/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando a lista de cores
        List<String> cores = new ArrayList<>();

        // Adicionando cores à lista
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Anil");
        cores.add("Branco");
        cores.add("Azul-marinho");
        cores.add("Rosa");
        cores.add("Abobora");

        // Exibindo apenas as cores que começam com "A"
        System.out.println("Cores que comecam com 'A':");
        System.out.println("-------------------------");

        // Usando loop for tradicional
        for (String cor : cores) {
            if (cor.startsWith("A")) {
                System.out.println(cor);
            }
        }

        // Alternativa com forEach e lambda (Java 8+)
    }
}
