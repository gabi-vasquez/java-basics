package variables;

public class Variables {
    public static void main(String[] args) {
        // 1. Declare una variable de tipo int llamada edad
        int edad;    
        // 2. Inicializa la variable edad con el valor 20
        edad = 20;
        // 3. Imprime el valor de la variable edad
        System.out.println(edad);
        // 4. Cambia el valor de la variable edad a 21
        edad = 21;
        // 5. Imprime el valor de la variable edad
        System.out.println(edad);
        // 6. Declara una variable de tipo long llamada habitantes
        long habitantes;
        // 7. Inicializa la variable habitantes con el valor 7000000000
        habitantes = 7000000000l;
        // 8. Imprime el valor de la variable habitantes
        System.out.println(habitantes);
        // 9. Declara una variable de tipo float llamada peso
        float peso;
        // 10. Inicializa la variable peso con el valor 75.5
        peso = 75.5f;
        // 11. Imprime el valor de la variable peso
        System.out.println(peso);
        // 12. Declara una variable de tipo double llamada altura
        double altura;
        // 13. Inicializa la variable altura con el valor 1.75
        altura = 1.75;
        // 14. Imprime el valor de la variable altura
        System.out.println(altura);
        // 15. Declara una variable de tipo char llamada inicial
        char inicial;
        // 16. Inicializa la variable inicial con el valor 'J'
        inicial = 'J';
        // 17. Imprime el valor de la variable inicial
        System.out.println(inicial);
        // 18. Declara una variable de tipo boolean llamada esMayorDeEdad
        boolean esMayorDeEdad;
        // 19. Inicializa la variable esMayorDeEdad con el valor true
        esMayorDeEdad = true;     
        // 20. Imprime el valor de la variable esMayorDeEdad
        System.out.println(esMayorDeEdad);
        // 21. Declara una variable de tipo String llamada nombre
        String nombre;
        // 22. Inicializa la variable nombre con el valor "Juan"
        nombre = "Juan";
        // 23. Imprime el valor de la variable nombre
        System.out.println(nombre);
        // 24. Declara una variable de tipo String llamada edadTexto
        String edadTexto;
        // 25. Inicializa la variable edadTexto con el valor "20"
        edadTexto = "20";
        // 26. Declara una variable de tipo int llamada edadNumero
        int edadNumero;
        // 27. Convierte la variable edadTexto a un valor de tipo int y asignalo a la variable edadNumero
        int edadTexto1 = Integer.parseInt(edadTexto);
        //** edadTexto2 = Integer.valueOf(edadTexto);
        edadNumero = edadTexto1;
        // 28. Imprime el valor de la variable edadNumero
        System.out.println(edadNumero);
        // 29. Declara una variable de tipo String llamada habitantesTexto
        String habitantesTexto;
        // 30. Inicializa la variable habitantesTexto con el valor "7000000000"
        habitantesTexto = "7000000000";
        // 31. Declara una variable de tipo long llamada habitantesNumero
        long habitantesNumero;
        // 32. Convierte la variable habitantesTexto a un valor de tipo long y asignalo a la variable habitantesNumero
        long habitantesTexto1 = Long.parseLong(habitantesTexto);
        habitantesNumero = habitantesTexto1;
        // 33. Imprime el valor de la variable habitantesNumero
        System.out.println(habitantesNumero);
        // 34. Declara una variable de tipo String llamada pesoTexto
        String pesoTexto;
        // 35. Inicializa la variable pesoTexto con el valor "75.5"
        pesoTexto = "75.5";
        // 36. Declara una variable de tipo float llamada pesoNumero
        float pesoNumero;
        // 37. Convierte la variable pesoTexto a un valor de tipo float y asignalo a la variable pesoNumero
        float pesoTexto1 = Float.parseFloat(pesoTexto);
        pesoNumero = pesoTexto1;
        // 38. Imprime el valor de la variable pesoNumero
        System.out.println(pesoNumero);

    }
}
