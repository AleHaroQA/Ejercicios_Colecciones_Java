package extras;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
    String.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra;

        do {
            System.out.println("Ingrese una letra:");
            letra = leer.nextLine();
        } while (letra.length() != 1);


        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {

            System.out.println("La letra es una vocal.");
        } else {
            System.out.println("Ingresó una consonante, número o signo.");
        }

    }
}
