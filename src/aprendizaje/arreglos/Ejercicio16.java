package aprendizaje.arreglos;

import java.util.Scanner;

public class Ejercicio16 {

    /*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 0;

        System.out.println("Ingrese tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Ingrese un número para buscar en el vector:");
        int nBuscado = leer.nextInt();

        System.out.println("VECTOR");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            if (vector[i] == nBuscado) {
                cont++;
                if (cont == 1) {
                    System.out.print("El número está en la ubicación: " + "[" + i + "]");
                } else {
                    System.out.print(" [" + i + "]");
                }
            } else if (cont == 0) {
                System.out.println("El número no se encuentra en el vector");
            }
        }
    }
}
