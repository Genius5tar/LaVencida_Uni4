/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Enumeration_5 {
    public static void main(String[] args) {
        // Crear un Vector para el proyecto de brazo robótico
        Vector<String> vector = new Vector<>();
        vector.add("chasis");
        vector.add("ESP32");
        vector.add("cables");
        vector.add("fuente");
        
        // Obtener una Enumeration desde el Vector
        Enumeration<String> enumeracion = vector.elements();
        
        // Iterar a través de la Enumeration
        System.out.println("Elementos del Vector:");
        while (enumeracion.hasMoreElements()) {
            String elemento = enumeracion.nextElement();
            System.out.println(elemento);
        }
    }
}
