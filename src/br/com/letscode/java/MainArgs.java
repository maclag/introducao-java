package br.com.letscode.java;

public class MainArgs {

    public static void main (String[] args) {

        // Autoboxing
        Integer wrapper = 9;
        System.out.println(wrapper);

        // Unboxing
        int unb = 12;
        System.out.println(unb);
        unb = wrapper;
        System.out.println(unb);

        Integer first = 1;
        Integer second = 1;

        System.out.println(first == second);
        System.out.println(first.compareTo(second) == 0);
        System.out.println(first.compareTo(1) == 0);
        System.out.println(first.compareTo(2) == 0);

        String numero = "1";
        System.out.println(first.compareTo(Integer.parseInt(numero)) == 0);

    }
}
