package cap3;

import cap2.RandomUtilities;

import java.util.Random;

public class Ejercicio10 {

    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(5, 20, new Random());
        final var promedioSimple = calcularPromedio(n);
        imprimirResultado(n, promedioSimple);
    }

    static int calcularPromedio(int n){
        var numerador = 0;
        for (int i = 1; i < n; i++) {
            numerador += i;
        }
        return numerador;
    }

    static void imprimirResultado(int n, int promedio){
        System.out.printf("El promedio simple desde 1 hasta %d es %d%n", n, promedio);
    }
}
