package listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        // Los arrays son un tipo de dato que permite almacenar varios valores del mismo tipo.
        // Los arrays tienen un tamaño fijo, es decir, una vez que se declaran no se pueden agregar o eliminar elementos.
        // Para declarar una lista se utiliza la siguiente
        // sintaxis: tipo: int, String, double, etc.
        // tipo[] nombre = new tipo[tamaño];
        // Ejemplo:
        //int[] numeros = new int[5];
        //System.out.println(Arrays.toString(numeros));
        //numeros[0] = 6;
        //System.out.println(Arrays.toString(numeros));

        // 1. Declara una lista de tipo String llamada nombres con tamaño 5
        String[] nombres = new String[5];
        // 2. Asigna los siguientes valores a la lista nombres: "Juan", "Pedro", "María", "Ana", "Luis".
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "María";
        nombres[3] = "Ana";
        nombres[4] = "Luis";
        // 3. Imprime el valor de la posición 0 de la lista nombres
        System.out.println(nombres[0]);
        // 4. Imprime el valor de la posición 2 de la lista nombres
        System.out.println(nombres[2]);
        // 5. Imprime el valor de la posición 4 de la lista nombres
        System.out.println(nombres[4]);
        // 6. Cambia el valor de la posición 0 de la lista nombres por "Carlos"
        nombres[0] = "Carlos";
        // 7. Imprime el valor de la posición 0 de la lista nombres
        System.out.println(nombres[0]);
        // 8. Utiliza un ciclo for para imprimir todos los valores de la lista nombres
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for(String nombre : nombres){
            System.out.println(nombre);
        }
        // 9. Utiliza un ciclo for para imprimir todos los valores de la lista nombres en orden inverso
        for(int i = nombres.length - 1;i>= 0 ;i--){
            System.out.println(nombres[i]);
        }
        // 10. Utiliza un ciclo for para imprimir todos los valores de la lista nombres en orden inverso
        
        String[] nombres2 = new String[10];
        for(int i = 0; i < nombres.length; i++){
            nombres2[i] = nombres[i];
        }
        System.out.println("Nueva lista Nombres");
        System.out.println(Arrays.toString(nombres2));

        for(int i = 0; i < nombres2.length; i++){
            System.out.println(nombres2[i]);        
        }

        for(String nombre : nombres2){
            System.out.println(nombre);
        }

        // ArrayList es una clase que permite crear listas dinámicas, es decir, que no tienen un tamaño
        // definido. Para declarar una lista dinámica se utiliza la siguiente sintaxis:
        // ArrayList<tipo> nombre = new ArrayList<tipo>();
        // Ejemplo:
        ArrayList<String> nombres3 = new ArrayList<String>();
        

        // 11. Declara una lista dinámica de tipo String llamada nombres

        // 12. Agrega los siguientes valores a la lista nombres: "Juan", "Pedro", "María", "Ana", "Luis".
        nombres3.add("Juan");
        nombres3.add("Pedro");
        nombres3.add("María");
        nombres3.add("Ana");
        nombres3.add("Luis");
        // 13. Imprime el valor de la posición 0 de la lista nombres
        System.out.println(nombres3.get(0));
        // 14. Imprime el valor de la posición 2 de la lista nombres
        System.out.println(nombres3.get(2));
        // 15. Agrega el valor "Carlos" a la lista nombres
        nombres3.add("Carlos");
        // 16. Utiliza un ciclo for para imprimir todos los valores de la lista nombres
        System.out.println("1");
        for(String nombre1 : nombres3){
            System.out.println(nombre1);
        }
        System.out.println("2");
        for(int i = 0; i < nombres3.size();i++){
            System.out.println(nombres3.get(i));
        }
        // 17. Cambia el valor de la posición 0 de la lista nombres por "Jorge"
        nombres3.set(0, "Jorge");
        System.out.println(nombres3.get(0));
        nombres3.remove(1);
        nombres3.remove("Luis");
        // 18. Utiliza un cicl0o for para imprimir todos los valores de la lista nombres

    }
}
