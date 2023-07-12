package listas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Tarea2 {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        // Hacer una programa que pida en la terminal al usuario 10 nombres
        try {
            FileWriter guardados = new FileWriter("archivos/archivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(guardados);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa un nombre");
                String nombre = consola.nextLine();
                bufferedWriter.write(nombre);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error en el archivo");
        }

    }

}