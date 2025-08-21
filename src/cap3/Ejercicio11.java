package cap3;

import cap2.RandomUtilities;

import java.util.Random;

public class Ejercicio11 {

    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(2, 10, new Random());
        final var factorial = calcularFactorial(n);
        imprimirResultado(n, factorial);
    }

    static int calcularFactorial(int n){
        var factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        return factorial;
    }
    static void imprimirResultado(int n, int factorial){
        System.out.printf("El factorial de %d es %d%n", n, factorial);
    }
}
