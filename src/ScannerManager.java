import java.util.Scanner;

public class ScannerManager {
    static int leerInt(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    static double leerDouble(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    static String leeString(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static boolean leeBoolean(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }

    static char leeChar(Scanner scanner, String mensaje){
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }
}
