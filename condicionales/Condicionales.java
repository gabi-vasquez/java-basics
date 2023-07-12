package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        // Los condicionales nos permiten controlar el flujo de un programa.
        // Los condicionales se utilizan para tomar decisiones.
        // Los condicionales se utilizan para ejecutar un bloque de codigo si se cumple o no una condicion.

        // 1. Declara una variable de tipo int llamada edad
        int edad;
        // 2. Inicializa la variable edad con el valor 20
        edad = 20;
        // 3. Mira si la variable edad es mayor que 18 e imprime "Es mayor de edad"
        if (edad > 18){ 
        System.out.println("Es mayor de edad");
        }
        // 4. Si no imprime "Es menor de edad"
        else {
        System.out.println("Es menor de edad");
        }
        // 5. Declara una variable de tipo int llamada numero
        int numero;
        // 6. Inicializa la variable numero con el valor 10
        numero = 10;
        // 7. Mira si la variable numero es mayor que 0 e imprime "Es positivo"
        if( numero > 0){
            System.out.println("Es positivo");
        }
        // 8. Si no mira si la variable numero es menor que 0 e imprime "Es negativo"
        else if(numero < 0){
            System.out.println("Es negativo");
        }
        // 9. Si no imprime "Es cero"
        else{
            System.out.println("Es cero");
        }
        // 10. Declara una variable de tipo int llamada numero1
        int numero1;
        // 11. Inicializa la variable numero1 con el valor 10
        numero1 = 10;
        // 12. Declara una variable de tipo int llamada numero2
        int numero2;
        // 13. Inicializa la variable numero2 con el valor 20
        numero2 = 20;
        // 14. Mira si la variable numero1 es mayor que la variable numero2 e imprime "numero1 es mayor que numero2"
        if(numero1 > numero2){
            System.out.println("numero1 es mayor que numero2");
        }
        // 15. Si no mira si la variable numero1 es menor que la variable numero2 e imprime "numero1 es menor que numero2"
        else if(numero1 < numero2){
            System.out.println("numero1 es menor que numero2");
        }
        // 16. Si no imprime "numero1 es igual a numero2"
        else{
            System.out.println("numero1 es igual a numero2");
        }
        // 17. Muestra en pantalla un menu con las siguientes opciones: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        // 18. Declara una variable de tipo int llamada opcion
        int opcion;
        // 19. Inicializa la variable opcion con el valor 1
        opcion = 3;
        // 20. Mira si la variable opcion es igual a 1 e imprime "Sumar"
        switch(opcion){
            case 1:
            System.out.println("Sumar");
            break;
        // 21. Si no mira si la variable opcion es igual a 2 e imprime "Restar"
            case 2:
            System.out.println("Restar");
            break;
        // 22. Si no mira si la variable opcion es igual a 3 e imprime "Multiplicar"
            case 3:
            System.out.println("Multiplicar");
            break;
        // 23. Si no mira si la variable opcion es igual a 4 e imprime "Dividir"
            case 4:
            System.out.println("Dividir");
            break;
        // 24. Si no imprime "Opcion incorrecta"
            default:
            System.out.println("Opcion incorrecta");
            break;
        }
        // 25. Declara una variable de tipo int llamada dia
        int dia;
        // 26. Inicializa la variable dia con el valor 1
        dia = 10;
        // 27. Mira si la variable dia es igual a 1 e imprime "Lunes"
        switch(dia){
            case 1:
            System.out.println("Lunes");
            break;
        // 28. Si no mira si la variable dia es igual a 2 e imprime "Martes"
            case 2:
            System.out.println("Martes");
            break;
        // 29. Si no mira si la variable dia es igual a 3 e imprime "Miercoles"
            case 3:
            System.out.println("Miercoles");
            break;
        // 30. Si no mira si la variable dia es igual a 4 e imprime "Jueves"
            case 4:
            System.out.println("Jueves");
            break;
        // 31. Si no mira si la variable dia es igual a 5 e imprime "Viernes"
            case 5:
            System.out.println("Viernes");
            break;
        // 32. Si no mira si la variable dia es igual a 6 e imprime "Sabado"
            case 6:
            System.out.println("Sabado");
            break;
        // 33. Si no mira si la variable dia es igual a 7 e imprime "Domingo"
            case 7:
            System.out.println("Domingo");
            break;
        // 34. Si no imprime "Dia incorrecto"
            default:
            System.out.println("Dia incorrecto");
            break;
        }
    }
}
