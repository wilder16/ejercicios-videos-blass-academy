package cap2;

import java.util.Scanner;

public class Ejercicio2Comparacion {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        final var a = ScannerManager.leerInt(scanner, "Ingrese el primer numero");
        final var b = ScannerManager.leerInt(scanner, "Ingrese el segundo numero");

        scanner.close();

        final var sonIguales = preguntarIgualdad(a, b);
        imprimirMensaje(a, b, sonIguales);

    }
    static boolean preguntarIgualdad(int a, int b){
        return a == b;
    }

    static void imprimirMensaje(int a, int b, boolean sonIgules){
        System.out.printf("El numero %d, con el numero %d son igaules? %b%n", a, b, sonIgules);
    }
}
