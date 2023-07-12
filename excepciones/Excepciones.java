package excepciones;

public class Excepciones {
    public static void main(String[] args) {
        // Las excepciones son errores que ocurren durante la ejecucion del programa.
        // Utilizar try-catch para manejar excepciones.

        // 1. Declara una variable de tipo int llamada numerador
        try {
            int numerador;

            // 2. Inicializa la variable numerador con el valor 10
            numerador = 10;

            // 3. Declara una variable de tipo int llamada denominador
            int denominador;

            // 4. Inicializa la variable denominador con el valor 0
            denominador = 0;

            // 5. Declara una variable de tipo int llamada resultado
            int resultado;

            // 6. Inicializa la variable resultado con el valor de la variable numerador
            // dividido por la variable
            resultado = numerador % denominador;
            System.out.println("El resultado de la division es: + " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error dividir entre cero");

        }
        // 7. Imprime el valor de la variable resultado
        finally {
            System.out.println("No es posible una division entre 0 por ende no tiene resultado");
        }

    }
}
