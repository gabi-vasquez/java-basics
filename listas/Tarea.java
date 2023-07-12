package listas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // Hacer una programa que pida en la terminal al usuario 10 nombres
        ArrayList<String> listaDeNombres = new ArrayList<String>();
        try {
            FileWriter guardados = new FileWriter("archivos/archivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(guardados);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa un nombre");
                String nombre = consola.nextLine();
                // Los nombres deben ser guardados en una lista
                listaDeNombres.add(nombre);
                bufferedWriter.write(nombre);
                bufferedWriter.newLine();
                
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println("Test");
        }
        // Al finalizar se debe imprimir todos los nombres ingresados
        //System.out.println("Los nombres ingresados son:");
        FileReader fileReader = new FileReader("archivos/archivo.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String container;
        while((container = reader.readLine()) != null){
            System.out.println(container);
        }
        reader.close();
        for (String nombre : listaDeNomres) {
             //System.out.println(nombre);
        }

    }

}
