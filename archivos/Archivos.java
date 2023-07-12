package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) {
        // Para manipular archivos se utiliza la clase File
        // Para crear un objeto de tipo File se utiliza la siguiente sintaxis:
        // File nombre = new File("ruta");
        // Ejemplo:
        // File archivo = new File("C:\\Users\\Usuario\\Desktop\\archivo.txt");

        // 1. Crea un objeto de tipo File llamado archivo con la ruta "C:\\Users\\Usuario\\Desktop\\archivo.txt"
        File archivo = new File("archivos/archivo.txt");
        // Para escribir en un archivo se utiliza la clase FileWriter
        // Para crear un objeto de tipo FileWriter se utiliza la siguiente sintaxis:
        // FileWriter nombre = new FileWriter("ruta");
        // Ejemplo:
        // FileWriter escritor = new FileWriter("C:\\Users\\Usuario\\Desktop\\archivo.txt");

        // 2. Crea un objeto de tipo FileWriter llamado escritor con la ruta "C:\\Users\\Usuario\\Desktop\\archivo.txt"
    try{
        FileWriter escritor = new FileWriter("archivos/archivo.txt");
        // 3. Escribe el texto "Hola mundo" en el archivo
        escritor.write("Hola mundo");
        // 4. Cierra el archivo
        escritor.close();
        // Para leer un archivo se utiliza la clase FileReader
        // Para crear un objeto de tipo FileReader se utiliza la siguiente sintaxis:
        // FileReader nombre = new FileReader("ruta");
        // Ejemplo:
        // FileReader lector = new FileReader("C:\\Users\\Usuario\\Desktop\\archivo.txt");

        // 5. Crea un objeto de tipo FileReader llamado lector con la ruta "C:\\Users\\Usuario\\Desktop\\archivo.txt"
        FileReader lector = new FileReader("archivos/archivo.txt");
        BufferedReader br = new BufferedReader(lector);
        // 6. Crea un ciclo while que lea el archivo y lo imprima en la consola
        String contenido;
        while((contenido = br.readLine())!= null){
            System.out.println(contenido);
        }
        // 7. Cierra el archivo
        lector.close();
    
    }

    catch(IOException exception){
        System.out.println("Error en el archivo");
    }
    }
    
}
