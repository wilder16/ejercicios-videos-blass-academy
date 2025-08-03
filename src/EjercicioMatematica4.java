import java.util.Random;

public class EjercicioMatematica4 {

    public static void main(String[] args) {

        final var random = new Random();

        final var radio = RandomUtilities.generarRandomInt(20, 100, random);

        final var perimetro = calcularPerimetro(radio);
        final var area = calcularArea(radio);
        mostrarResultados(radio, perimetro, area);


    }

    static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    static double calcularArea(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static void mostrarResultados(int radio, double perimetro, double area) {
        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f%n",
                radio, perimetro, area);
    }
}
