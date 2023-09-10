package aprendizaje.bucles;

import java.util.Scanner;

public class Ejercicio13 {

    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

            * * * *
            *     *
            *     *
            * * * *
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int elementos;

        System.out.println("Ingrese cantidad de elementos:");
        elementos = leer.nextInt();

        for (int i = 1; i <= elementos; i++) {
            for (int j = 1; j <= elementos; j++) {
                if ((i > 1 && i <  elementos) && (j>1 && j<elementos)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
