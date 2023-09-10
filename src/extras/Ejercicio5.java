package extras;

import java.util.Scanner;

public class Ejercicio5 {

    /*
    Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double tto;
        char tipo;

        do {
            System.out.println("Ingrese clase de socio:");
            tipo = leer.next().toUpperCase().charAt(0);

        } while (tipo != 'A' && tipo != 'B' && tipo != 'C');


        System.out.println("Ingrese valor de tratamiento:");
        tto = leer.nextInt();

        switch (tipo) {
            case 'A':
                System.out.println("Tiene un 50% de descuento");
                tto = tto * 0.5;
                System.out.println("El total a pagar es: " + tto);
                break;
            case 'B':
                System.out.println("Tiene un 35% de descuento");
                tto = tto * 0.65;
                System.out.println("El total a pagar es: " + tto);
                break;
            case 'C':
                System.out.println("No tiene derecho a beneficio");
                System.out.println("El total a pagar es: " + tto);
                break;
            default:
                System.out.println("Debe ingresar una clase válida");
        }

    }
}
