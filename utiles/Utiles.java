package utiles;


public class Utiles {
    public static void main(String[] args) {
        // 1. Uso de banderas para controlar el flujo de un programa.
        // Declara una variable de tipo boolean llamada bandera
        boolean bandera;

        // 2. Inicializa la variable bandera con el valor true
        bandera = true;
        // 3. Mira si la variable bandera es true e imprime "La bandera es true"
        if (bandera == true){
            System.out.println("La bandera es true");
        }
        // 4. Si no imprime "La bandera es false"
        else{
            System.out.println("La bandera es false");
        }
        // 5. Cambia el valor de la variable bandera a false
        bandera = false;
        // 6. Mira si la variable bandera es true e imprime "La bandera es true"
        if(bandera == true){
            System.out.println("La bandera es true");
        }
        // 7. Si no imprime "La bandera es false"
        else{
            System.out.println("La bandera es false");
        }
        // 8. Uso de banderas en un ciclo while.
        // Declara una variable de tipo int llamada contador
        int contador;

        // 9. Inicializa la variable contador con el valor 0
        contador = 0;

        // 10. Mientras la variable contador sea menor que 10
        // imprime "El contador es: " y el valor de la variable contador
        // 11. Incrementa la variable contador en 1
        while(contador < 10){
            System.out.println("El contador es: " + contador );
            contador++;
        }

        // 12. Uso de acumuladores en un ciclo while.
        // Declara una variable de tipo int llamada contador1
        int contador1;
        
        //13. Inicializa la variable contador1 con el valor 0
        contador1 = 0;

        // 14. Declara una variable de tipo int llamada suma
        int suma;

        // 15. Inicializa la variable suma con el valor 0
        suma = 0;

        // 16. Mientras la variable contador1 sea menor que 10
        while(contador1 < 10){
            
        // 17. Incrementa la variable contador1 en 1
        contador1++;

        // 18. Incrementa la variable suma con el valor de la variable contador1
            suma += contador1;

            System.out.println("contador");
            System.out.println(contador1);
            System.out.println("suma");
            System.out.println(suma);

        }

    }



// import java.util.Scanner;
        

//public class EjemploUtilidad {
//   public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean encontrado = false; // Bandera booleana para indicar si se encontró el elemento
//         int contador = 0; // Contador para contar la cantidad de elementos encontrados
//         int acumulador = 0; // Acumulador para sumar los elementos encontrados

//         // Pedir al usuario que ingrese una serie de números y buscar el número 5
//         System.out.println("Ingresa una serie de números (ingresa -1 para terminar):");

//         while (true) {
//             int numero = scanner.nextInt();

//             if (numero == -1) {
//                 break;
//             }

//             if (numero == 5) {
//                 encontrado = true;
//                 contador++;
//                 acumulador += numero;
//             }
//         }

//         // Mostrar resultados
//         System.out.println("¿Se encontró el número 5? " + encontrado);
//         System.out.println("Cantidad de veces que se encontró el número 5: " + contador);
//         System.out.println("Suma de los números 5 encontrados: " + acumulador);
//     }
// }

}