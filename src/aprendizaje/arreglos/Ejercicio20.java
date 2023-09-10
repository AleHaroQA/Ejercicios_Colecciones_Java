package aprendizaje.arreglos;

import java.util.Scanner;

public class Ejercicio20 {

    /*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
    suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
    permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
    El programa deberá comprobar que los números introducidos son correctos, es decir,
    están entre el 1 y el 9.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int t = 3;
        int tVector = 8;
        int[][] matriz= new int[t][t];
        int[] vector = new int[tVector];
        int suma, validador, contVector;

        //Validación de números ingreados entre el 1 y el 9
        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                do {
                    System.out.print("Ingrese un valor para la posición "+ i + "," + j + ": ");
                    matriz[i][j] = leer.nextInt();
                }while (matriz[i][j] <1 || matriz[i][j] >9);
            }
        }

        //Suma de filas
        for (int i = 0; i <t; i++) {
            suma = 0;
            for (int j = 0; j <t; j++) {
                suma = suma + matriz[i][j];
                if (j == 2) {
                    for (int k = 0; k <tVector; k++) {
                        vector[k] = suma;
                    }
                }
            }
        }

        //Suma de columnas
        for (int i = 0; i <t; i++) {
            suma = 0;
            for (int j = 0; j <t; j++) {
                suma = suma + matriz[j][i];
                if (j == 2) {
                    for (int k = t; k <t+t; k++) {
                        vector[k] = suma;
                    }
                }
            }
        }

        //Suma de diagonal 1
        suma = 0;
        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                if (i == j) {
                    suma = suma + matriz[j][i];
                }
                if (j == 2) {
                    for (int k = t+t; k <(t+t)+1; k++) {
                        vector[k] = suma;
                    }
                }
            }
        }

        //Suma de diagonal 2
        suma = 0;
        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                if (i+j == t-1) {
                    suma = suma + matriz[j][i];
                }
                if (j == 2) {
                    for (int k = (t+t)+1; k <(t+t)+2; k++) {
                        vector[k] = suma;
                    }
                }
            }
        }

        //Validar matriz

        validador = vector[0];
        contVector = 0;
        for (int i = 1; i <tVector; i++) {

            if (vector[i] == validador ) {
                contVector ++;
            }
        }

        if (contVector == tVector-1) {
            System.out.println("La matriz es mágica");
        }else {
            System.out.println("La matriz NO es mágica");
        }

    }
}
