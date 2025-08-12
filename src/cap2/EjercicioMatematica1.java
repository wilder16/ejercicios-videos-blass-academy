package cap2;

import java.util.Random;

public class EjercicioMatematica1 {
    public static void main(String[] args) {
        final var random = new Random();
        final var velocidadInicial = RandomUtilities.generarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);

        final var velociadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        mostrarResultados(velocidadInicial, aceleracion, tiempo, velociadFinal);


    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion + tiempo;
    }

    static void mostrarResultados(
            double velocidadInicial,
            double aceleracion,
            int tiempo,
            double velociadFinal
    ) {
        System.out.printf("Para una valocidad inicial %.3f, una aceleracion %.3f y un tiempo %d. " +
                        "Se tiene una velocidad final %.3f usando MRUV%n",
                velocidadInicial, aceleracion, tiempo, velociadFinal);
    }
}
