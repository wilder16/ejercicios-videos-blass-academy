package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        String diaSemana;
        do {
            diaSemana = ScannerManager.leerString(scanner,
                    "Ingrese el dia de la semana, escriba SALIDA para terminar el programa");
            if(!diaSemana.equals("SALIDA")){
                final var kcal = calcularKCal(DiaSemana.valueOf(diaSemana));
                imprimirResultado(diaSemana, kcal);
            }

        }while (!diaSemana.equals("SALIDA"));
        scanner.close();
    }


    static int calcularKCal(DiaSemana diaSemana){
        return switch (diaSemana){
            case LUNES      -> 350;
            case MARTES     -> 420;
            case MIERCOLES  -> 220;
            case JUEVES     -> 600;
            case VIERNES    -> 125;
            case SABADO     -> 250;
            case DOMINGO    -> 100;
        };
    }

    static void imprimirResultado(String diaSemana, int kCal){
        System.out.printf("Para el dia %s debo quemar %d%n", diaSemana, kCal);
    }

    enum DiaSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}