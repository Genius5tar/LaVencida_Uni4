/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.ArrayList;

/**
 *
 * @author PEDRO DE HORTA
 */
public class ArrayList_9 {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> FrutNevera = new ArrayList<>();

        // Agregar elementos a la FrutNevera
        FrutNevera.add("Manzana");
        FrutNevera.add("Banana");
        FrutNevera.add("Cereza");
        FrutNevera.add("Damasco");

        // Acceder a un elemento por índice
        String elemento = FrutNevera.get(2);
        System.out.println("Elemento en la posición 2: " + elemento);

        // Iterar sobre la FrutNevera
        System.out.println("Elementos en la FrutNevera:");
        for (String item : FrutNevera) {
            System.out.println(item);
        }

        // Verificar si la FrutNevera contiene un elemento específico
        boolean contieneBanana = FrutNevera.contains("Banano");
        System.out.println("¿La FrutNevera contiene Banana?: " + contieneBanana);

        // Obtener el tamaño de la FrutNevera
        int tamaño = FrutNevera.size();
        System.out.println("Tamaño de la FrutNevera: " + tamaño);

        // Eliminar un elemento de la FrutNevera
        FrutNevera.remove("Banana");
        System.out.println("FrutNevera después de eliminar Banana: " + FrutNevera);
    }
}
