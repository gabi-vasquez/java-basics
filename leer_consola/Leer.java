package leer_consola;

import java.util.Scanner;

public class Leer {
    public static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String llamada nombre
        System.out.println("Ingrese su nombre");
        String nombre;
        // 2. Utiliza la variable consola para leer el nombre desde la consola
        nombre = consola.nextLine();
        // 3. Imprime el valor de la variable nombre
        System.out.println(nombre);
        // 4. Declara una variable de tipo int llamada edad
        System.out.println("Ingresa tu edad");
        int edad;
        // 5. Utiliza la variable consola para leer la edad desde la consola
        edad = consola.nextInt();
        // 6. Imprime el valor de la variable edad
        System.out.println(edad);
    }
}
