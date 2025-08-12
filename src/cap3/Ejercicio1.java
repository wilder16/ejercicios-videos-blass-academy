package cap3;

import cap2.RandomUtilities;
import cap2.ScannerManager;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numeroLeido = ScannerManager.leerInt(scanner, "Ingrese un numero del 1 al 6");
        scanner.close();

        if(validarNumero(numeroLeido)){
            final var numeroAleatorio = RandomUtilities.generarRandomInt(1, 6, new Random());
            mostrarMensajeGanador(numeroLeido, numeroAleatorio);
        }else{
            System.out.println("Numero no valido, intentalo de nuevo");
        }
    }

    static boolean validarNumero(int n){
        return (n >= 1) && (n <= 6);
    }

    static void mostrarMensajeGanador(int numeroLeido, int numeroAletorio){
        System.out.printf("El numero aletorio es: %d%n", numeroAletorio);

        if(numeroLeido == numeroAletorio){
            System.out.println("Ganaste!!");
        }else{
            System.out.println("Perdiste!!");
        }

    }
}
