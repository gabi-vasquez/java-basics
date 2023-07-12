package funciones;

public class Funciones {
    public static void main(String[] args) {
        // Las funciones son bloques de codigo que se pueden llamar desde cualquier parte del programa.
        // Las funciones nos permiten reutilizar codigo.
        // Las funciones nos permiten dividir un problema en partes mas pequeñas.
        // Las funciones nos permiten hacer el codigo mas legible.
        // Las funciones nos permiten hacer el codigo mas facil de mantener.
        
        // 1. Llamar la funcion suma con los valores 5 y 10 e imprimir el resultado.
        System.out.println(suma(5, 10));
        // 2. Llamar la funcion resta con los valores 5 y 10 e imprimir el resultado.
        System.out.println(resta(5, 10));
        // 3. Llamar la funcion multiplicacion con los valores 5 y 10 e imprimir el resultado.
        System.out.println(multiplicar(5, 10));
        // 4. Llamar la funcion division con los valores 5 y 10 e imprimir el resultado.
        System.out.println(dividir(5, 10));
        // 5. Llamar la funcion imprimirHolaMundo e imprimir el resultado.
        System.out.println(imprimirHolaMundo());
        // 6. Llamar la funcion imprimir con el mensaje "Hola mundo 2!" e imprimir el resultado.
        imprimir("Hola mundo 2!");
        
    }

    // La estructura de una funcion es la siguiente:
    // <modificador de acceso> <tipo de retorno> <nombre de la funcion>(<parametros de la funcion>) {
    //     <cuerpo de la funcion>
    // }
    
    // modificador de acceso: public, private, protected
    // tipo de retorno: int, String, boolean, void
    // nombre de la funcion: nombre de la funcion. Ejemplo: suma, resta, imprimir, etc.
    // parametros de la funcion: int a, int b, String cadena, etc.
    // cuerpo de la funcion: codigo que se ejecuta cuando se llama la funcion.

    // Ejemplo de una funcion que suma dos numeros enteros.
    public static int suma(int a, int b) {
        return a + b;
    }

    // 1. Crea una funcion que reste dos numeros enteros.
    public static int resta(int c, int d){
        return c - d;
    }

    // 2. Crea una funcion que multiplique dos numeros enteros.
    public static int multiplicar(int e, int f){
        return e * f;
    }

    // 3. Crea una funcion que divida dos numeros enteros.
    public static int dividir(int g, int h){
        return g / h;
    }

    // 4. Crea una funcion llamada imprimirHolaMundo que imprima "Hola mundo!"
    public static String imprimirHolaMundo(){
        return "Hola mundo";
    }

    // 5. Crea una funcion llama imprimir que imprima un mensaje que recibe como parametro.
    public static void imprimir(String mensaje){
        System.out.println(mensaje);

    }

}
