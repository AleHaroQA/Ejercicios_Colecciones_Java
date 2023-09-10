package extras;

import java.util.Scanner;

public class Ejercicio10 {

    /*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre
    dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
    si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
    al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int multiplicando, multiplicador, respuesta, producto;

        multiplicando = (int) (Math.random() * 10);
        multiplicador = (int) (Math.random() * 10);

        producto = multiplicando * multiplicador;

        do {
            System.out.println("Adivine el resultado de la multiplicación:");
            respuesta = reader.nextInt();
        } while (producto != respuesta);

        System.out.println("Adivinaste! El producto de " + multiplicando + " por " + multiplicador + " es: " + respuesta);

    }
}
