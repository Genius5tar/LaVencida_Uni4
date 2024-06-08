/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Collection_6 {
    public static void main(String[] args) {
        // Crear una colección (en este caso, un ArrayList) para las edades de la familia
        Collection<Integer> edades = new ArrayList<>();
        
        // Añadir edades a la colección
        edades.add(30); // Edad de la primera persona
        edades.add(45); // Edad de la segunda persona
        edades.add(15); // Edad de la tercera persona
        edades.add(55); // Edad de la cuarta persona
        
        // Imprimir la colección antes de ordenar
        System.out.println("Edades de la familia antes de ordenar: " + edades);
        
        // Ordenar la colección de edades
        List<Integer> listaEdades = new ArrayList<>(edades);
        Collections.sort(listaEdades);
        
        // Imprimir la colección de edades después de ordenar
        System.out.println("Edades de la familia después de ordenar: " + listaEdades);
        
        // Barajar la lista de edades
        Collections.shuffle(listaEdades);
        
        // Imprimir la lista de edades después de barajar
        System.out.println("Edades de la familia después de barajar: " + listaEdades);
    }
}
