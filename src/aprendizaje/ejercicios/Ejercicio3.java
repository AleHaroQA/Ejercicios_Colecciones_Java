package aprendizaje.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
    Java.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String phrase;

        System.out.println("Ingrese una frase:");
        phrase = leer.nextLine();

        System.out.println("La frase en mayúsculas es: "+ phrase.toUpperCase());
        System.out.println("La frase en minúsculas es: "+ phrase.toLowerCase());
    }
}
