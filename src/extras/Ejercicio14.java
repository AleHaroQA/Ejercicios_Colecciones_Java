package extras;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio14 {

    /*
    Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
    hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
    cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int familias, hijos;
        double suma;

        System.out.print("Ingrese cantidad de familias: ");
        familias = reader.nextInt();
        System.out.print("Ingrese cantidad de hijos por cada familia: ");
        hijos = reader.nextInt();

        double[][] mediaEdad = new double[familias][hijos];
        double[] mostrarMedia = new double[familias];

        for (int i = 0; i < familias; i++) {
            suma = 0;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad de hijo " + (j + 1) + " |familia " + (i + 1));
                mediaEdad[i][j] = reader.nextInt();
                suma += mediaEdad[i][j];
            }
            mostrarMedia[i] = suma/hijos;
        }

        for (int i = 0; i < familias; i++) {
            System.out.println("La media de edad de los hijos de la familia "+(i+1)+" es: "+mostrarMedia[i]);
        }
    }
}
