package aprendizaje.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    //Crear un programa que dado un numero determine si es par o impar.

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingrese número para saber si es par o impar:");
        n = leer.nextInt();

        if (n%2 == 0) {
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        }
    }
}
