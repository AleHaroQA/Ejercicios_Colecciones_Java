package aprendizaje.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

    /*Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si
    el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
    por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
    “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Ingrese una frase o palabra de 8 caracteres:");
        phrase = leer.nextLine();

        if (phrase.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
