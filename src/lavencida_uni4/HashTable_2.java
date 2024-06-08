/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author PEDRO DE HORTA
 */
public class HashTable_2 {
    public static void main(String[] args) {
        // Crear una instancia de Hashtable
        Hashtable<String, String> listaMateriales = new Hashtable<>();
        
        // Agregar pares clave-valor a la tabla hash
        listaMateriales.put("mat1", "chasis");
        listaMateriales.put("mat2", "ESP32");
        listaMateriales.put("mat3", "cables");
        listaMateriales.put("mat4", "fuente");
        listaMateriales.put("mat5", "servos");
        
        // Obtener y mostrar el tamaño de la tabla hash
        System.out.println("Tamaño de la lista de materiales: " + listaMateriales.size());
        
        // Obtener y mostrar un valor asociado con una clave
        String valor = listaMateriales.get("mat1");
        System.out.println("Material asociado con 'mat1': " + valor);
        
        // Enumerar todas las claves
        Enumeration<String> claves = listaMateriales.keys();
        System.out.println("Claves en la lista de materiales:");
        while (claves.hasMoreElements()) {
            System.out.println(claves.nextElement());
        }
        
        // Enumerar todos los valores
        Enumeration<String> valores = listaMateriales.elements();
        System.out.println("Materiales en la lista de materiales:");
        while (valores.hasMoreElements()) {
            System.out.println(valores.nextElement());
        }
        
        // Comprobar si la lista de materiales contiene una clave específica
        boolean contieneClave = listaMateriales.containsKey("mat2");
        System.out.println("¿Contiene 'mat2'?: " + contieneClave);
        
        // Comprobar si la lista de materiales contiene un valor específico
        boolean contieneValor = listaMateriales.contains("fuente");
        System.out.println("¿Contiene 'fuente'?: " + contieneValor);
        
        // Eliminar un par clave-valor de la lista de materiales
        listaMateriales.remove("mat2");
        System.out.println("Tamaño de la lista de materiales después de eliminar 'mat2': " + listaMateriales.size());
        
        // Comprobar si la lista de materiales está vacía
        System.out.println("¿Está vacía la lista de materiales? " + listaMateriales.isEmpty());
        
        // Limpiar la lista de materiales
        listaMateriales.clear();
        System.out.println("Tamaño de la lista de materiales después de limpiar: " + listaMateriales.size());
    }
}
