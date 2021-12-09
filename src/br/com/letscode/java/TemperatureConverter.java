package br.com.letscode.java;

public class TemperatureConverter {

    public static void main (String[] args) {
        double celsius = 70;

        final double fator1 = 9.0/5; // pois, você estava dividindo 2 ints => resultaria num int, mas colocando 9.0 já resulta num valor float/double
        final double fator2 = 32;

        final double fahr = (celsius * fator1) + fator2;

        System.out.println(fahr);
    }
}
