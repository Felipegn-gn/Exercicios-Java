/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laboratorio
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Double> a = new HashMap<>();

        a.put("Feijao 500g", 9.50);
        a.put("Arroz 5kg", 22.90);
        a.put("Leite", 5.99);

        System.out.println("Percorrendo o Map");

        for (Map.Entry<String, Double> entrada : a.entrySet()) {
            System.out.println("Produto: " + entrada.getKey() + " R$ " + entrada.getValue());

        }
    }

}
