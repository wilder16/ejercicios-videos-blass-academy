package cap2;

import java.util.Random;

public class EjercicioMatematica3 {

    public static void main(String[] args) {
        final var random = new Random();

        final var cateto1 = RandomUtilities.generarRandomDouble(5, 100, random);
        final var cateto2 = RandomUtilities.generarRandomDouble(5, 100, random);

        final var hipotenusa = calcularHipotenusa(cateto1, cateto2);
        mostrarResultados(cateto1, cateto2, hipotenusa);


    }

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    static void mostrarResultados(double cateto1, double cateto2, double hipotenusa) {
        System.out.printf("Para los catetos %.3f & %.3f tenemos una hipotenusa de %.3f%n",
                cateto1, cateto2, hipotenusa);

    }
}
