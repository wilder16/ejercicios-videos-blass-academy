package cap3;

import cap2.RandomUtilities;

import java.util.Random;

public class Ejercicio8 {

    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());
        System.out.printf("n: %d%n", n);
        System.out.printf("El recuento 1 es: %d%n", contarValor1(n));
        System.out.printf("El recuento 2 es: %d%n", contarValor2(n));
        System.out.printf("El recuento 3 es: %d%n", contarValor3(n));
    }

    static int contarValor1(int n){
        var contador = 0;
        for (int i = 1; i < n; i++) {
            if(i % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
    static int contarValor2(int n){
        var contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0){
                contador++;
            }
        }
        return contador;
    }
    static int contarValor3(int n){
        var contador = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 10 == 0){
                contador++;
            }
        }
        return contador;
    }

}
