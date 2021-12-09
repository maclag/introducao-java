package br.com.letscode.java;

public class TiposPrimitivos {

    public static void main (String[] args) {
        final double pi = 3.14;
        final double raio = 10;

        System.out.printf("Área com (pi=3.14): %f%n", Math.pow(raio, 2) * pi);
        System.out.printf("Área com Math.PI: %f", raio * raio * Math.PI);
    }
}
