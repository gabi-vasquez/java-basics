package ciclos;

public class Ciclos {
    public static void main(String[] args) {
        // Los ciclos son estructuras de control que nos permiten repetir un bloque de codigo varias veces.
        
        // 1. Ciclo while, imprime los numeros del 1 al 10
        int numero = 1;
        while(numero <= 10){
            System.out.println(numero);
            numero++;
        }
        // 2. Ciclo while, imprime los numeros del 10 al 1
        int num = 10;
        while(num >= 1){
            System.out.println(num);
            num--;
        }
        // 3. Ciclo while, imprime los numeros pares del 1 al 10
        int numerospares = 1;
        while(numerospares <= 10){
            if (numerospares % 2 == 0){
                System.out.println(numerospares);
            }
            numerospares++;
        }
        // 4. Ciclo while, imprime los numeros impares del 1 al 10
        int numerosImpares = 1;
        while(numerosImpares<= 10){
            if(numerosImpares % 2 == 1){
            System.out.println(numerosImpares);
            }
        numerosImpares++;
        }
        // 5. Ciclo for, imprime los numeros del 1 al 10
        numero = 10;
        for(int i = 1; i <= numero;i++ ){
            System.out.println(i);
        }
        // 6. Ciclo for, imprime los numeros del 10 al 1
        num = 1;
        for(int i = 10;i >= num; i--){
            System.out.println(i);
        }
        // 7. Ciclo for, imprime los numeros pares del 1 al 10
        int numerosPares = 10;
        for(int i = 1; i <= numerosPares; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        // 8. Ciclo for, imprime los numeros impares del 1 al 10
        int numerosimpares = 10;
        for(int i = 1; i <= numerosimpares; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        // 9. Ciclo while con break, imprime los numeros del 1 al 10, cuando llegue al 5 debe terminar el ciclo
        int numero1 = 1;
        while(numero1 <= 10){
            System.out.println(numero1);
            numero1++;
            if(numero1 == 6 ){
                break;
            }
        }
        // 10. Ciclo for con break, imprime los numeros del 1 al 10, cuando llegue al 5 debe terminar el ciclo
        for(int i = 1; i <= 10;i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }
        // 11. Ciclo while con continue, imprime los numeros del 1 al 10, cuando llegue al 5 debe saltar a la siguiente iteracion
        int numero2 = 0;
        while(numero2 < 10){
            numero2++;
            if(numero2 == 5){
                continue;
            }
            System.out.println(numero2);
        }
        // 12. Ciclo for con continue, imprime los numeros del 1 al 10, cuando llegue al 5 debe saltar a la siguiente iteracion
        for(int i = 1; i <= 10;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        
        // 13. Ciclo while con break y continue, imprime los numeros del 1 al 10, cuando llegue al 5 debe terminar el ciclo y cuando llegue al 3 debe saltar a la siguiente iteracion
        int numero3 = 0;
        while(numero3 < 10){
            numero3++;
            if(numero3 == 3){
                continue;
            }
            if(numero3 == 6){
                break;
            }
            System.out.println(numero3);
        }
        // 14. Ciclo for con break y continue, imprime los numeros del 1 al 10, cuando llegue al 5 debe terminar el ciclo y cuando llegue al 3 debe saltar a la siguiente iteracion
        for(int i = 1; i <= 10; i++){
            if(i == 3){
                continue;
            }
            if(i == 6){
                break;
            }
            System.out.println(i);
        }
        // 15. Ciclo while infinito, imprime los numeros del 1 al 10, cuando llegue a 10 debe terminar el ciclo
        int n;
        n = 1;
        while(true){
            if(n <= 10){
                System.out.println(n);
                n++;
            }
            else{
                break;
            }
        }
        
        
    }
}
