/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.Arrays;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Array_7 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // Ordenar el arreglo
        Arrays.sort(numbers);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numbers));

        // Buscar un elemento en el arreglo
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("El índice del elemento 7 es: " + index);

        // Llenar el arreglo con un valor específico
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Arreglo lleno: " + Arrays.toString(filledArray));

        // Convertir un arreglo en una lista
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Arreglo original: " + Arrays.toString(array));
        var list = Arrays.asList(array);
        System.out.println("Lista generada a partir del arreglo: " + list);
    }
}
