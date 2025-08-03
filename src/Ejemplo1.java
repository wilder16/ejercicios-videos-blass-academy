import java.util.Random;

public class Ejemplo1 {

    public static void main(String[] args) {
        final var min = 10;
        final var max = 50;

        final var random = new Random();

        final var numeroAleatorio = random.nextInt(max - min + 1) + min;
        System.out.println(numeroAleatorio);
    }
}
