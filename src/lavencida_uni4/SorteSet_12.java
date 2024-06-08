/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author PEDRO DE HORTA
 */
public class SorteSet_12 {
    public static void main(String[] args) {
        // Crear un conjunto ordenado de productos por su nombre
        SortedSet<String> inventory = new TreeSet<>();

        // Agregar algunos productos al inventario
        inventory.add("Laptop");
        inventory.add("Smartphone");
        inventory.add("Tablet");
        inventory.add("Smartwatch");

        // Mostrar los productos en orden alfabético
        System.out.println("Inventario de productos:");
        for (String product : inventory) {
            System.out.println(product);
        }

        // Agregar un nuevo producto
        inventory.add("Headphones");

        // Mostrar los productos actualizados en orden alfabético
        System.out.println("\nInventario actualizado de productos:");
        for (String product : inventory) {
            System.out.println(product);
        }

        // Mostrar el primer y último producto en el inventario
        System.out.println("\nPrimer producto: " + inventory.first());
        System.out.println("Último producto: " + inventory.last());
    }
}
