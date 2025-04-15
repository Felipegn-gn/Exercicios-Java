/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laboratorio
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, Integer> carac = new HashMap<>();

        carac.put("Felipe", 18);
        carac.put("Joao Victor", 20);
        carac.put("Luan", 19);

        System.out.println("Percorrendo o Map");

        for (Map.Entry<String, Integer> entrada : carac.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + " Idade: " + entrada.getValue());

        }
    }

}
