/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavencida_uni4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Properties_3 {
    public static void main(String[] args) {
        // Crear una instancia de Properties
        Properties propiedades = new Properties();
        
        // Establecer propiedades del brazo robótico
        propiedades.setProperty("material_chasis", "aluminio");
        propiedades.setProperty("tipo_controlador", "ESP_32");
        propiedades.setProperty("numero_servomotores", "4");
        propiedades.setProperty("tipo_fuente_energia", "bateria");        
        propiedades.setProperty("tipo_almc", "Litio_cells");        
        propiedades.setProperty("Nombre", "BlueBrazo");
        propiedades.setProperty("nivel_complejidad", "medio");
        
        // Guardar propiedades en un archivo
        try (OutputStream salida = new FileOutputStream("Brazo.properties")) {
            propiedades.store(salida, "Configuracion_del_Brazo Robotico");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Cargar propiedades desde un archivo
        try (InputStream entrada = new FileInputStream("Brazo.properties")) {
            propiedades.load(entrada);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Obtener y mostrar una propiedad
        String materialChasis = propiedades.getProperty("material_chasis");
        System.out.println("Material del chasis: " + materialChasis);
        
        // Listar todas las propiedades
        propiedades.list(System.out);
    }
}
