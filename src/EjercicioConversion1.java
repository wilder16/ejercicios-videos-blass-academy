public class EjercicioConversion1 {
    public static void main(String[] args) {

        final var precio1 = "45.50";
        final var precio2 = "32.20";
        final var precio3 = "75.12";

        final var suma = calcularSuma(precio1, precio2, precio3);
        imprimirResultados(suma);
    }

    static double calcularSuma(String precio1, String precio2, String precio3){
        final var precio1Numero = Double.parseDouble(precio1);
        final var precio2Numero = Double.parseDouble(precio2);
        final var precio3Numero = Double.parseDouble(precio3);
        return precio1Numero + precio2Numero + precio3Numero;
    }
    static void imprimirResultados(double sumaTotal){
        System.out.printf("El precio total es %.3f%n", sumaTotal);
    }

}
