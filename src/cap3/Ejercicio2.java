package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese un monto");
        scanner.close();

        final var montoFinal = calcularMonto(montoInicial);
        imprimiResultado(montoInicial, montoFinal);

    }

    static double calcularMonto(double montoInicial){
        final var monto1 = (montoInicial % 2 == 0) ? (0.1 * montoInicial) : 0;
        final var monto2 = (montoInicial % 3 == 0) ? 500 : 0;
        final var monto3 = (montoInicial > 500) ? 300 : 0;

        return  montoInicial + monto1 + monto2 + monto3;
    }

    static void imprimiResultado(double montoInicial, double montoFinal){
        System.out.printf("Para el prestamo %.2f se cobrar al final %.2f%n",
                montoInicial, montoFinal);
    }
}
