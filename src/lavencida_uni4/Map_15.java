/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Map_15 {
    public static void main(String[] args) {
        // Crear un mapa para almacenar los puntajes de los estudiantes
        Map<String, Integer> GradosEscolares = new HashMap<>();

        // Agregar puntajes de estudiantes al mapa
        GradosEscolares.put("Juan", 85);
        GradosEscolares.put("María", 90);
        GradosEscolares.put("Pedro", 78);
        GradosEscolares.put("Ana", 95);

        // Mostrar los puntajes de los estudiantes
        System.out.println("Puntajes de los estudiantes:");
        for (Map.Entry<String, Integer> entry : GradosEscolares.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Actualizar el puntaje de un estudiante
        GradosEscolares.put("Pedro", 80);

        // Mostrar los puntajes actualizados de los estudiantes
        System.out.println("\nPuntajes actualizados de los estudiantes:");
        for (Map.Entry<String, Integer> entry : GradosEscolares.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Obtener el puntaje de un estudiante específico
        String studentName = "María";
        int mariaGrade = GradosEscolares.get(studentName);
        System.out.println("\nPuntaje de " + studentName + ": " + mariaGrade);

        // Eliminar un estudiante del mapa
        GradosEscolares.remove("Ana");

        // Mostrar los puntajes actualizados después de eliminar a Ana
        System.out.println("\nPuntajes después de eliminar a Ana:");
        for (Map.Entry<String, Integer> entry : GradosEscolares.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
