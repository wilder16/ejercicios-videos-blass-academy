import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var min = 10;
        final var max = 50;

        final var random = new Random();

        final var numeroAleatorio = (max - min) * random.nextDouble() + min;
        System.out.println(numeroAleatorio);

    }
}
