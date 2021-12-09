package br.com.letscode.java;

public class ExerciseArgs {
    // Criar uma classe com uma função main
    // que vai receber um número via args e dizer se esse número é par ou impar
    // No terminal: PS D:\.estudo\Santander Coders\Modulo-06\aovivo\out\production\aovivo> java br.com.letscode.java.ExerciseArgs "parametro-1"
    public static void main (String[] args) {
        //System.out.println(args[0]);

        System.out.println(Double.parseDouble(args[0]) % 2 == 0 ? "Par" : "Ímpar");

    }
}
