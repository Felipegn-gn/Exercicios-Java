/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Laboratorio
 */
public class Ex11 {

    public static void main(String[] args) {
        Map<Integer, String> chave = new HashMap<>();

        chave.put(1, "Primeira");
        chave.put(2, "Segunda");
        chave.put(3, "Terceira");
        
       System.out.println("Percorrendo o Map");
       
       for(Map.Entry<Integer, String> entrada : chave.entrySet()){
          System.out.println("Chave: " +entrada.getKey() + " Valor: " +  entrada.getValue());
       
       }
    }

}
