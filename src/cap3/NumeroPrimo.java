package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        final  var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese un número para saber si es primo");
        scanner.close();
        if (esPrimo(n)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }

    static boolean esPrimo(int n){
        var i = 2;
        while (i < n){
            if (n % i != 0){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }
}
