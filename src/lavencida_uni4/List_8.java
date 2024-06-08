/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PEDRO DE HORTA
 */
public class List_8 {
     public static void main(String[] args) {
        // Crear una frutas_mesa
        List<String> frutas_mesa = new ArrayList<>();

        // Agregar elementos a la frutas_mesa
        frutas_mesa.add("Manzana");
        frutas_mesa.add("Banano");
        frutas_mesa.add("Cereza");
        frutas_mesa.add("Durazno");

        // Acceder a un elemento por índice
        String elemento = frutas_mesa.get(2);
        System.out.println("Elemento en la posición 2: " + elemento);

        // Iterar sobre la frutas_mesa
        System.out.println("Elementos en la frutas_mesa:");
        for (String item : frutas_mesa) {
            System.out.println(item);
        }

        // Verificar si la frutas_mesa contiene un elemento específico
        boolean contieneBanana = frutas_mesa.contains("Banana");
        System.out.println("¿La frutas_mesa contiene Banana?: " + contieneBanana);

        // Obtener el tamaño de la frutas_mesa
        int tamaño = frutas_mesa.size();
        System.out.println("Tamaño de la frutas_mesa: " + tamaño);

        // Eliminar un elemento de la frutas_mesa
        frutas_mesa.remove("Banana");
        System.out.println("frutas_mesa después de eliminar Banana: " + frutas_mesa);
    }
}

