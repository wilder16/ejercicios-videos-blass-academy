package cap3;

import cap2.ScannerManager;

import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese el numero para saber si es capicúa");
        scanner.close();
        if (verificarCapicua(n)){
            System.out.println("ES CAPICUA!!!");
        }else {
            System.out.println("NO ES CAPICUA!!!");
        }
    }

    static int invertirNumero(int n){
        var aux = n;
        var inverso = 0;

        while (aux != 0){
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux/=10;
        }

        return inverso;
    }

    static boolean verificarCapicua(int n){
        final var inverso = invertirNumero(n);
        return n == inverso;
    }
}

