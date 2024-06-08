/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.util.Vector;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Vector_4 {
    public static void main(String[] args) {
        // Crear una instancia de Vector para el álbum de fotos
        Vector<String> albumFotos = new Vector<>();
        
        // Meter fotos al álbum
        albumFotos.add("Foto 1");
        albumFotos.add("Foto 2");
        albumFotos.add("Foto 3");        
        albumFotos.add("Foto 4");

        
        // Obtener y mostrar el tamaño del álbum de fotos
        System.out.println("Tamaño del álbum de fotos: " + albumFotos.size());
        
        // Comprobar si el álbum de fotos está vacío
        System.out.println("¿Está vacío el álbum de fotos? " + albumFotos.isEmpty());
        
        // Mostrar las fotos del álbum
        System.out.println("Fotos en el álbum:");
        for (String foto : albumFotos) {
            System.out.println(foto);
        }
        
        // Mostrar la primera foto del álbum
        System.out.println("Primera foto del álbum: " + albumFotos.firstElement());
        
        // Mostrar la última foto del álbum
        System.out.println("Última foto del álbum: " + albumFotos.lastElement());
        
        // Sacar una foto del álbum
        albumFotos.remove("Foto 2");
        
        // Mostrar el tamaño del álbum de fotos después de sacar una foto
        System.out.println("Tamaño del álbum de fotos después de sacar 'Foto 2': " + albumFotos.size());
    }
}
