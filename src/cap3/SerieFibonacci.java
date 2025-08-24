package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner,
                "Ingrese el número hasta donde desea visualizar los n primero nuermos de la serie Fibonacci");
        scanner.close();

        mostrarSerieFibonacci(n);

    }

    static void mostrarSerieFibonacci(double n){
        var anterior = 0;
        var actual = 1;
        System.out.printf("%d %d ", anterior, actual);
        for (int i = 0; i < n - 2; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }
}
