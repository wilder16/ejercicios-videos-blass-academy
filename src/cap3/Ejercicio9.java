package cap3;

import cap2.RandomUtilities;

import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());
        System.out.printf("n: %d%n", n);
        System.out.printf("La suma  1 es: %d%n", calcularSuma1(n));
        System.out.printf("La suma  2 es: %d%n", calcularSuma2(n));
        System.out.printf("La suma  3 es: %d%n", calcularSuma3(n));
    }

    static int calcularSuma1(int n){
        var suma = 0;
        for (int i = 1; i <= n ; i++) {
            suma+=i;
        }
        return suma;
    }

    static int calcularSuma2(int n){
        var suma = 0;
        for (int i = 1; i < n ; i++) {
           if(i % 2 == 0){
               suma += i;
           }
        }
        return suma;
    }

    static int calcularSuma3(int n){
        var suma = 0;
        for (int i = 1; i < n ; i++) {
            if(i % 7 == 0){
                suma += i;
            }
        }
        return suma;
    }
}
