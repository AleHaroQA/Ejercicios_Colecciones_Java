package aprendizaje.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n1,n2,suma;

        System.out.println("Ingrese primer número:");
        n1 = leer.nextInt();
        System.out.println("Ingrese segundo número:");
        n2 = leer.nextInt();

        suma = n1 + n2;

        System.out.println("El resultado es: " + suma);
    }
}
