public class EjercicioConversion2 {
    public static void main(String[] args) {
        final var cantidad1 = "23";
        final var cantidad2 = "5";
        final var cantidad3 = "111";

        final var suma = calcularSuma(cantidad1, cantidad2, cantidad3);
        imprimirResultado(suma);

    }

    static int calcularSuma(String cantidad1, String cantidad2, String cantidad3){
        final var cantidad1Suma = Integer.parseInt(cantidad1);
        final var cantidad2Suma = Integer.parseInt(cantidad2);
        final var cantidad3Suma = Integer.parseInt(cantidad3);
        return cantidad1Suma + cantidad2Suma + cantidad3Suma;
    }

    static void imprimirResultado(int sumaTotal){
        System.out.printf("El precio total es %d%n", sumaTotal);
    }
}
