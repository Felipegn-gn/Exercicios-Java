/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laboratorio
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Character, Integer> a = new HashMap<>();

        a.put('A', 1);
        a.put('B', 2);
        a.put('C', 3);

        System.out.println("Percorrendo o Map");

        for (Map.Entry<Character, Integer> entrada : a.entrySet()) {
            System.out.println("Letra: " + entrada.getKey() + " numero: " + entrada.getValue());

        }
    }
}
