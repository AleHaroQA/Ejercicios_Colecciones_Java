package extras;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
    por debajo de 1.60 mts. y el promedio de estaturas en general.
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int nPersonas, contBajo;
        double estatura, promedioBajo, promedioGeneral;

        contBajo = 0;
        promedioBajo = 0;
        promedioGeneral = 0;

        System.out.println("Ingrese cantidad de personas a preguntar estatura:");
        nPersonas = reader.nextInt();

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Ingrese estatura para persona " + (i + 1));
            estatura = reader.nextDouble();
            promedioGeneral += estatura;

            if (estatura < 1.60) {
                promedioBajo += estatura;
                contBajo++;
            }
        }

        System.out.println("El promedio para las " + contBajo + " personas con estatura menor a 1.60 es: " + promedioBajo/contBajo);
        System.out.println("El promedio de estatura general es: " + promedioGeneral / nPersonas);

    }
}
