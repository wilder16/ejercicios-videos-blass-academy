import java.util.Random;
import java.util.Scanner;

public class Ejercicio2AumentoDecremento {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var a = ScannerManager.leerInt(scanner, "Ingrese el numero");

        scanner.close();

        a--; // Incremento su valor en 1

        mostrarValor(a);

        final var random = new Random();
        final var n = RandomUtilities.generarRandomInt(3, 10, random);
        mostrarValor(n);

        a -= n;

        mostrarValor(a);

    }

    static void mostrarValor(int a){
        System.out.printf("El valor de a es: %d%n", a);
    }
}