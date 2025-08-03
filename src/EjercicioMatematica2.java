import java.util.Random;

public class EjercicioMatematica2 {

    public static void main(String[] args) {
        final var random = new Random();

        final var aceleracion = RandomUtilities.generarRandomDouble(100, 300, random);
        final var masa = RandomUtilities.generarRandomDouble(3, 5, random);

        final var fuerza = calcularFuerza(masa, aceleracion);
        mostrarResultados(masa, aceleracion, fuerza);


    }


    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void mostrarResultados(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa %.4f y aceleracion de %.4f tenemos una fuerza de %.4f%n",
                masa, aceleracion, fuerza);
    }
}
