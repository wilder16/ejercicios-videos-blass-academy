package cap3;

import cap2.RandomUtilities;

import java.util.Random;

public class Ejercicio7 {

    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(5, 20, new Random());
        System.out.printf("n: %d%n", n);
        mostarNumeros1(n);
        mostarNumeros2(n);
        mostarNumeros3(n);
    }

    static void mostarNumeros1(int n){
        for (int i = 1; i < n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static void mostarNumeros2(int n){
        for (int i = 1; i <= n ; i++) {
            if(i % 2 != 0){
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    static void mostarNumeros3(int n){
        for (int i = n; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
