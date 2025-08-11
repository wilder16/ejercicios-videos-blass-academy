import java.util.Scanner;

public class Ejercicio3Multiplo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var n = ScannerManager.leerInt(scanner, "Ingrese el numero");

        scanner.close();

        final var esMultiplo2 = calcularMultiplo2(n);
        final var esMultiplo5 = calcularMultiplo5(n);

        imprimirResultado(n, esMultiplo2, esMultiplo5);

    }

    static boolean calcularMultiplo2(int n){
        return n % 2 == 0;
    }

    static boolean calcularMultiplo5(int n){
        return n % 5 == 0;
    }

    static void imprimirResultado(int n, boolean esMultiplo2, boolean esMultiplo5){
        System.out.printf("El numero %d es multiplo de 2? %b%n", n, esMultiplo2);
        System.out.printf("El numero %d es multiplio de 5? %b%n", n,esMultiplo5);
    }


}
