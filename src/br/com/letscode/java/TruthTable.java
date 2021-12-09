package br.com.letscode.java;

public class TruthTable {

    public static void main (String[] args) {

        // False
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        System.out.println();

        // And (&&)
        System.out.println("true && false = " + (true && false));
        System.out.println("true && true = " + (true && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();

        // Or (||)
        System.out.println("true || false = " + (true || false));
        System.out.println("true || true = " + (true || true));
        System.out.println("false || false = " + (false || false));

    }
}
