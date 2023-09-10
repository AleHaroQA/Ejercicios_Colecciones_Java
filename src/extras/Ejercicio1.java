package extras;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int min, day, hr, minAux;

        System.out.print("Ingrese minutos:");
        min = leer.nextInt();
        minAux = min;


        min = Math.abs(min / 60);
        hr = min % 24;

        if (hr == 0) {
            day = min / 24;
        } else {
            day = (min - hr) / 24;
        }

        if (minAux == 1) {
            System.out.println(minAux + " minuto es equivalente a: " + day + " días y " + hr + " horas.");
        } else {
            System.out.println(minAux + " minutos es equivalente a: " + day + " día(s) y " + hr + " hora(s).");
        }

    }
}
