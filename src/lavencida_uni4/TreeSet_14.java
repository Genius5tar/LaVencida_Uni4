/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.TreeSet;

/**
 *
 * @author PEDRO DE HORTA
 */
public class TreeSet_14 {
    public static void main(String[] args) {
        // Crear un conjunto para almacenar las fechas de eventos
        TreeSet<String> RealC_Partidos = new TreeSet<>();

        // Agregar algunas fechas de eventos al conjunto
        RealC_Partidos.add("2024-06-15");
        RealC_Partidos.add("2024-07-20");
        RealC_Partidos.add("2024-08-10");
        RealC_Partidos.add("2024-09-05");

        // Mostrar las fechas de eventos en orden cronológico
        System.out.println("Fechas de eventos:");
        for (String date : RealC_Partidos) {
            System.out.println("- " + date);
        }

        // Agregar una nueva fecha de evento al conjunto
        RealC_Partidos.add("2024-07-01");

        // Mostrar las fechas de eventos actualizadas en orden cronológico
        System.out.println("\nFechas de eventos actualizadas:");
        for (String date : RealC_Partidos) {
            System.out.println("- " + date);
        }

        // Mostrar la primera y última fecha de evento en el conjunto
        System.out.println("\nPrimera fecha de evento: " + RealC_Partidos.first());
        System.out.println("Última fecha de evento: " + RealC_Partidos.last());
    }

}
