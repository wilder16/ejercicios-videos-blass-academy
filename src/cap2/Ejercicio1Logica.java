package cap2;

import java.util.Random;

public class Ejercicio1Logica {
    public static void main(String[] args) {
        final var random = new Random();

        final var n = RandomUtilities.generarRandomInt(10, 200, random);

        final var cumpleCondicion1 = preguntarCondicional1(n);
        final var cumpleCondicion2 = preguntarCondicional2(n);

        System.out.printf("El numero %d es par y es mayor que 50? %b%n", n, cumpleCondicion1);
        System.out.printf("El numero %d es multiplo de 3 o es menor igual que 35? %b%n", n, cumpleCondicion2);


    }

    static boolean preguntarCondicional1(int n){ return (n % 2 == 0) && (n > 50); }

    static boolean preguntarCondicional2(int n){ return (n % 3 == 0) || (n <= 35); }


}
