package aprendizaje.funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {

    /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
    introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
    función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
    una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
    (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
     */


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double euros;
        String cambio;
        System.out.println("Ingrese cantidad de euros a convertir:");
        euros = leer.nextInt();

        do {
            System.out.println("A que moneda quiere convertir los euros?");
            System.out.println("Dolares (escribir sin tilde)");
            System.out.println("Libras");
            System.out.println("Yenes");
            cambio = leer.next();
        } while (!cambio.equalsIgnoreCase("dolares") && !cambio.equalsIgnoreCase("libras") &&
                !cambio.equalsIgnoreCase("yenes"));

        convertirEuros(euros, cambio);
    }

    public static void convertirEuros(double euros, String cambio) {

        switch (cambio) {
            case "dolares":
                euros *= 1.28611;
                System.out.println("El cambio a dólares es: " + euros);
                break;
            case "libras":
                euros *= 0.861;
                System.out.println("El cambio a libras es: " + euros);
                break;
            case "yenes":
                euros *= 129.852;
                System.out.println("El cambio a yenes es: " + euros);
                break;
            default:
                System.out.println("Debe elegir una opción válida");
        }


    }
}
