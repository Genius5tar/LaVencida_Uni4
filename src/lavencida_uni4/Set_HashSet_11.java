/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Set_HashSet_11 {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random random = new Random();
        
        // Crear un conjunto para almacenar los números únicos
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Generar 10 números aleatorios y agregarlos al conjunto
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Números aleatorios entre 0 y 99
            uniqueNumbers.add(randomNumber);
        }
        
        // Mostrar los números únicos generados
        System.out.println("Números únicos generados:");
        for (int uniqueNumber : uniqueNumbers) {
            System.out.println(uniqueNumber);
        }
        
        // Mostrar la cantidad de números únicos generados
        System.out.println("Cantidad de números únicos generados: " + uniqueNumbers.size());
    }
}
