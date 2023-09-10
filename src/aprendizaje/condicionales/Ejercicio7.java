package aprendizaje.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
    investigar la función equals() en Java.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Ingrese contraseña:");
        phrase = leer.nextLine();

        if (phrase.toLowerCase().equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
