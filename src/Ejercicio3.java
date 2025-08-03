import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad");
        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura");

        /*System.out.print("Ingrese su edad: ");
        final var edad = scanner.nextInt();

        System.out.print("Ingrese su estatura: ");
        final var estatura = scanner.nextDouble();
        */

        scanner.nextLine();

//        System.out.print("Ingrese su nombre: ");
//        final var nombre = scanner.nextLine();

        final var nombre = ScannerManager.leeString(scanner, "Ingrese su nombre");

        scanner.close();

        System.out.printf("Tu nombre es %s%n", nombre);
        System.out.printf("Tu edad es %d y tu estatura es %.2f cm%n", edad, estatura);

    }
}
