package aprendizaje.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
    Math.sqrt().*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingrese un número entero:");
        n = leer.nextInt();

        System.out.println("El doble del número es: " + (n*2));
        System.out.println("El triple del número es: " + (n*3));
        System.out.println("La raíz cuadrada del número es: " + (Math.sqrt(n)));


    }
}
