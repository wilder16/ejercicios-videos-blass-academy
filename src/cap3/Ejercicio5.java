package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var diaSemana = ScannerManager.leerString(scanner, "Ingrese el dia de la semana");
        scanner.close();

        final var kcal = calcularKCal(diaSemana);

        if (kcal != -1){
            imprimirResultado(diaSemana, kcal);
        }else{
            System.out.println("Dia incorrecto, ingrese de nuevo en mayuscula");
        }

    }

    static int calcularKCal(String diaSemana){
        return switch (diaSemana){
            case "LUNES"        -> 350;
            case "MARTES"       -> 420;
            case "MIERCOLES"    -> 220;
            case "JUEVES"       -> 600;
            case "VIERNES"      -> 125;
            case "SABAOD"       -> 250;
            case "DOMINGO"      -> 100;
            default             -> -1;
        };
    }

    static void imprimirResultado(String diaSemana, int kCal){
        System.out.printf("Para el dia %s debo quemar %d%n", diaSemana, kCal);
    }
}
