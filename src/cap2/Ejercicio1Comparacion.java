package cap2;

import java.util.Random;

public class Ejercicio1Comparacion {
    public static void main(String[] args) {
        final var random = new Random();

        final var a = RandomUtilities.generarRandomInt(-500, 20, random);
        final var b = RandomUtilities.generarRandomInt(-500, 20, random);

        final var aNegativo = preguntarNegativo(a);
        final var bNegativo = preguntarNegativo(b);

        imprimirResultado(a, aNegativo);
        imprimirResultado(b, bNegativo);

    }

    static boolean preguntarNegativo(int n){ return n < 0; }

    static void imprimirResultado(int n, boolean esNegativo){
        System.out.printf("El numero %d es negativo? %b%n", n, esNegativo);
    }
}
