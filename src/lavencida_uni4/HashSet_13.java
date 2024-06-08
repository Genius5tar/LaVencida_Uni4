/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PEDRO DE HORTA
 */
public class HashSet_13 {
    public static void main(String[] args) {
        // Crear un conjunto para almacenar las tareas
        Set<String> TareasProjec = new HashSet<>();

        // Agregar algunas tareas al conjunto
        TareasProjec.add("Desarrollar la función de inicio de sesión");
        TareasProjec.add("Diseñar la interfaz de usuario");
        TareasProjec.add("Realizar pruebas de rendimiento");
        TareasProjec.add("Actualizar la documentación");

        // Mostrar las tareas en el conjunto
        System.out.println("Tareas pendientes:");
        for (String task : TareasProjec) {
            System.out.println("- " + task);
        }

        // Agregar una nueva tarea al conjunto
        TareasProjec.add("Implementar la funcionalidad de registro");

        // Mostrar las tareas actualizadas en el conjunto
        System.out.println("\nTareas actualizadas:");
        for (String task : TareasProjec) {
            System.out.println("- " + task);
        }

        // Eliminar una tarea del conjunto
        TareasProjec.remove("Realizar pruebas de rendimiento");

        // Mostrar las tareas actualizadas después de eliminar una tarea
        System.out.println("\nTareas actualizadas después de eliminar:");
        for (String task : TareasProjec) {
            System.out.println("- " + task);
        }
    }
}
