package aprendizaje.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese temperatura en grados Celsius:");
        int temp = leer.nextInt();

        int fahrenheit = 32 + (9*temp/5);

        System.out.println("La temperatura en grados Fahreheit es: " + fahrenheit);

    }
}
