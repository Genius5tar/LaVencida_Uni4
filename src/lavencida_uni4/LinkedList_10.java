/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.LinkedList;

/**
 *
 * @author PEDRO DE HORTA
 */
public class LinkedList_10 {
    public static void main(String[] args) {
        // Crear una LinkedList para almacenar nombres de CiuVisitadas
        LinkedList<String> CiuVisitadas = new LinkedList<>();

        // Agregar nombres de CiuVisitadas a la lista
        CiuVisitadas.add("Tokio");
        CiuVisitadas.add("Nueva York");
        CiuVisitadas.add("Londres");
        CiuVisitadas.add("París");

        // Acceder a un elemento por índice
        String ciudad = CiuVisitadas.get(2);
        System.out.println("Ciudad en la posición 2: " + ciudad);

        // Iterar sobre la lista
        System.out.println("CiuVisitadas en la lista:");
        for (String item : CiuVisitadas) {
            System.out.println(item);
        }

        // Verificar si la lista contiene una ciudad específica
        boolean contieneLondres = CiuVisitadas.contains("Londres");
        System.out.println("¿La lista contiene Londres?: " + contieneLondres);

        // Obtener el tamaño de la lista
        int tamaño = CiuVisitadas.size();
        System.out.println("Tamaño de la lista: " + tamaño);

        // Eliminar el primer elemento de la lista
        String primeraCiudad = CiuVisitadas.pollFirst();
        System.out.println("Primera ciudad eliminada de la lista: " + primeraCiudad);
        System.out.println("Lista después de eliminar la primera ciudad: " + CiuVisitadas);
    }
}
