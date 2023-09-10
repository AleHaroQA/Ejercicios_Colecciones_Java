package extras;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        do {
            System.out.println("Ingrese un número del 1 al 10:");
            n = leer.nextInt();
        } while (n < 1 || n > 10);

        if (n < 4) {
            for (int i = 0; i < n; i++) {
                System.out.print("I");
            }
            System.out.println("");
        } else if (n == 4) {
            System.out.println("IV");
        } else if (n == 5) {
            System.out.println("V");
        } else if (n > 5 && n < 9) {
            System.out.print("V");
            for (int i = 0; i < n - 5; i++) {
                System.out.print("I");
            }
        } else if (n == 9) {
            System.out.println("IX");
        } else if (n == 10) {
            System.out.println("X");
        }

    }
}
