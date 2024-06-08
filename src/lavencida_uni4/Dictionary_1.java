/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Dictionary_1 {
    public static void main(String[] args) {
        // Crear una instancia de Hashtable (subclase de Dictionary)
        Dictionary<String, String> DicFritos = new Hashtable<>();
        
        // Agregar pares clave-valor al DicFritos
        DicFritos.put("estanteria1", "Empanada");
        DicFritos.put("estanteria2", "Arepa");
        DicFritos.put("estanteria3", "Dedito");
        
        // Obtener y mostrar el tamaño del DicFritos
        System.out.println("Tamaño del DicFritos: " + DicFritos.size());
        
        // Obtener y mostrar un valor asociado con una clave
        String valor = DicFritos.get("clave1");
        System.out.println("Valor asociado con 'clave1': " + valor);
        
        // Enumerar todas las claves
        Enumeration<String> claves = DicFritos.keys();
        System.out.println("Claves en el DicFritos:");
        while (claves.hasMoreElements()) {
            System.out.println(claves.nextElement());
        }
        
        // Enumerar todos los valores
        Enumeration<String> valores = DicFritos.elements();
        System.out.println("Valores en el DicFritos:");
        while (valores.hasMoreElements()) {
            System.out.println(valores.nextElement());
        }
        
        // Eliminar un par clave-valor del DicFritos
        DicFritos.remove("clave2");
        System.out.println("Tamaño del DicFritos después de eliminar 'clave2': " + DicFritos.size());
        
        // Comprobar si el DicFritos está vacío
        System.out.println("¿Está vacío el DicFritos? " + DicFritos.isEmpty());
    }
}
