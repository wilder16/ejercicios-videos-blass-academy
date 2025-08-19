package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var a = ScannerManager.leerInt(scanner, "Ingrese el primer valor");
        final var b = ScannerManager.leerInt(scanner, "Ingrese el segundo valor");

        imprimitMenu();

        final var opcion = ScannerManager.leerChar(scanner, "Ingrese la opcion");
        scanner.close();

        ejecutarOpcion(opcion, a, b);

    }

    static void ejecutarOpcion(char opcion, int a, int b){
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(a, b);
            case 'B', 'b' -> calcularResta(a, b);
            case 'C', 'c' -> calcularMultiplicacion(a, b);
            case 'D', 'd' -> calcularDividion(a, b);
            case 'E', 'e' -> calcularResto(a, b);
            default -> -1;
        };

        if(resultado != -1){
            System.out.printf("El resultado es: %d%n", resultado);
        }else {
            System.out.println("Opcion incorrecta, por favor ejecute le programa de nuevo");
        }
    }

   static void imprimitMenu(){
        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
       System.out.println("E/e: resto");
    }

    static int calcularSuma(int a, int b){
        return a + b;
    }

    static int calcularResta(int a, int b){
        return a - b;
    }

    static int calcularMultiplicacion(int a, int b){
        return a * b;
    }

    static int calcularDividion(int a, int b){
        return a / b;
    }

    static int calcularResto(int a, int b){
        return a % b;
    }
}
