package aprendizaje.bucles;

import java.util.Scanner;

public class Ejercicio10 {

    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el
    límite inicial.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numLimite, suma, num;

        suma = 0;

        System.out.println("Ingrese un número para establecer un límite de suma:");
        numLimite = leer.nextInt();

        do {
            System.out.println("Ingrese un número para sumar:");
            num = leer.nextInt();
            suma += num;
        } while (suma < numLimite);

        System.out.println("La suma de los números es: " + suma + " y ha superado el límite de " + numLimite);
    }
}
