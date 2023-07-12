package utiles;

import java.util.Scanner;

public class EjemploUtilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false; // Bandera booleana para indicar si se encontró el elemento
        int contador = 0; // Contador para contar la cantidad de elementos encontrados
        int acumulador = 0; // Acumulador para sumar los elementos encontrados

        // Pedir al usuario que ingrese una serie de números y buscar el número 5
        System.out.println("Ingresa una serie de números (ingresa -1 para terminar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero == 5) {
                encontrado = true;
                contador++;
                acumulador += numero;
            }
        }

        // Mostrar resultados
        System.out.println("¿Se encontró el número 5? " + encontrado);
        System.out.println("Cantidad de veces que se encontró el número 5: " + contador);
        System.out.println("Suma de los números 5 encontrados: " + acumulador);
        scanner.close();
    }
}