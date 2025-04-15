/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex15;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laboratorio
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Map<Integer, String> a = new HashMap<>();

        a.put(1234, "Joao");
        a.put(5678, "Luan");
        a.put(9123,"Felipe");

        System.out.println("Percorrendo o Map");

        for (Map.Entry<Integer, String> entrada : a.entrySet()) {
            System.out.println("Id: " + entrada.getKey() + " Nome: " + entrada.getValue());

        }
    }
    
}
